package io.github.enprogrammerare.trumnoter;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Converter {

	static final double TWELTH_ROOT_OF_TWO = 1.05946309435929;
	static final int TUNING = 440;

	private PrintStream debugStream;

	/**
	 * Converts the document to drum notes.
	 * @param document Music XML document.
	 * @param partNumber Part to convert.
	 * @return A new Music XML document with drum notes.
	 */
	public Document convert(Document document, int partNumber) {
		debugStream.println("Converting document...");
		Document template;
		
		try {
			template = XMLParser.read(MusicXMLTemplates.EMPTY_WOOD_BLOCK_TEMPLATE);
		} 
		catch (SAXException e) {
			e.printStackTrace();
			return null;
		}
		
		Element workTitle = (Element) document.getElementsByTagName("work-title").item(0);
		if (workTitle != null) {
			((Element) template.getElementsByTagName("work-title").item(0)).setTextContent(workTitle.getTextContent());
			debug(0, "Set name.");
		}
		
		((Element) template.getElementsByTagName("encoding-date").item(0)).setTextContent(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		debug(0, "Current date is " + new Date());
		
		Frequency[] frequencies = getFrequencies(getTones(document, partNumber));
		Element part = (Element) template.getElementsByTagName("part").item(0);
		int numberOfBars = 0;
		
		debugStream.println("Generating document.");
		for (Frequency freq : frequencies) {
			numberOfBars++;
			
			Element measure = template.createElement("measure");
			measure.setAttribute("number", String.valueOf(numberOfBars));
			
			Element attributes = template.createElement("attributes");
			
			//Klav och sånt krävs bara en gång.
			if (numberOfBars == 1) {
				//Ställ in divisions
				Element divisions = template.createElement("divisions");
				divisions.appendChild(template.createTextNode("8")); //Hårdkodat. Allt annat bygger på detta värde.
				attributes.appendChild(divisions);
				
				//Skapa och lägg in trumklav
				Element clef = template.createElement("clef");
				Element sign = template.createElement("sign");
				sign.appendChild(template.createTextNode("percussion"));
				clef.appendChild(sign);
				attributes.appendChild(clef);
			}
			
			double bpm = freq.frequency(); //Hur många BPM takten ska ha.
			double minutes = freq.tone().duration(); //Hur många minuter tonen ska vara.
			int numberOfNotes = (int) Math.round(bpm * minutes * 32 / 4);  //antal 32-delsnoter som krävs.
			
			//Skapa taktart för varje takt. Den är <antaltoner>/32.
			Element time = template.createElement("time");
			//time.setAttribute("print-direct", "yes");
			Element beats = template.createElement("beats");
			beats.setTextContent(String.valueOf(numberOfNotes));
			Element beatType = template.createElement("beat-type");
			beatType.setTextContent("32");
			time.appendChild(beats);
			time.appendChild(beatType);
			attributes.appendChild(time);
			
			//Säg att ha en notrad
			Element staffDetails = template.createElement("staff-details");
			Element staffLines = template.createElement("staff-lines");
			staffLines.setTextContent("1");
			staffDetails.appendChild(staffLines);
			attributes.appendChild(staffDetails);
			
			//Infoga attributes till takten.
			measure.appendChild(attributes);
			
			
			//Skapa en tempoangivelse
			Element direction = template.createElement("direction");
			direction.setAttribute("placement", "above");
			Element directionType = template.createElement("direction-type");
			Element metronome = template.createElement("metronome");
			Element beatUnit = template.createElement("beat-unit");
			beatUnit.setTextContent("quarter");
			Element perMinute = template.createElement("per-minute");
			perMinute.setTextContent(String.valueOf(freq.frequency()));
			metronome.appendChild(beatUnit);
			metronome.appendChild(perMinute);
			directionType.appendChild(metronome);
			direction.appendChild(directionType);
			Element sound = template.createElement("sound");
			sound.setAttribute("tempo", String.valueOf(bpm));
			direction.appendChild(sound);
			measure.appendChild(direction);
			
			//Skapa alla trumslag i takten.
			for (int i = 0; i < numberOfNotes; i++) {
				//Skapa info om allt som inte är tonhöjd: längd, sammanbindning, längd och voice.
				Element note = template.createElement("note");
				Element duration = template.createElement("duration");
				duration.setTextContent("1");
				Element voice = template.createElement("voice");
				voice.setTextContent("1");
				Element type = template.createElement("type");
				type.setTextContent("32nd");
				Element beam = template.createElement("beam");
				beam.setAttribute("number", "1");
				beam.setTextContent(String.valueOf(getBeamingType(i, numberOfNotes)));
				
				//Skapa info om tonhöjd.
				Element unpitched = template.createElement("unpitched");
				Element displayStep = template.createElement("display-step");
				Element displayOctave = template.createElement("display-octave");
				Element instrument = template.createElement("instrument");
				displayStep.setTextContent("F");
				displayOctave.setTextContent("4");
				instrument.setAttribute("id", "P1-I77");
				unpitched.appendChild(displayStep);
				unpitched.appendChild(displayOctave);
				
				note.appendChild(unpitched);
				note.appendChild(duration);
                note.appendChild(voice);
                note.appendChild(type);
                note.appendChild(beam);
                note.appendChild(instrument);
                
                measure.appendChild(note);
				
			}
			part.appendChild(measure);
		}
		
		debugStream.println("Done.");
		return template;
	}

	/**
	 * Returns a list of all tones in the document. Debug information is printed to
	 * the specified PrintStream.
	 * 
	 * @param document   A MusicXML document.
	 * @param partNumber The part number to read.
	 * @return Array of tones.
	 */
	Tone[] getTones(Document document, int partNumber) {
		debugStream.println("Interptreting...");
		List<Tone> tones = new ArrayList<>();

		int divisions = 32;
		int tempo = 120;

		NodeList measures = ((Element) document.getElementsByTagName("part").item(partNumber)).getElementsByTagName("measure");

		for (int i = 0; i < measures.getLength(); i++) {
			Element measure = (Element) measures.item(i);

			// Uppdaterar divisions via attributes/divisions
			Element attributes = (Element) measure.getElementsByTagName("attributes").item(0);
			if (attributes != null) {
				Element divisionsElem = (Element) attributes.getElementsByTagName("divisions").item(0);

				if (divisionsElem != null) {
					divisions = Integer.parseInt(divisionsElem.getTextContent());
					debug(i, "Divisions changed to " + divisions + ".");
				}
			}

			// Updaterar tempo via direction/sound[tempo]
			NodeList directions = measure.getElementsByTagName("direction");
			for (int j = 0; j < directions.getLength(); j++) {
				Element direction = (Element) directions.item(j);

				NodeList soundElements = direction.getElementsByTagName("sound");

				for (int k = 0; k < soundElements.getLength(); k++) {
					Element sound = (Element) soundElements.item(k);

					if (sound.getAttribute("tempo") != null && !sound.getAttribute("tempo").equals("")) {
						tempo = Integer.parseInt(sound.getAttribute("tempo"));
						debug(i, "Tempo changed to " + tempo + ".");
					}
				}
			}

			// Listar alla toner i denna takt. Via note/pitch/step--alter--octave//duration
			NodeList noteElements = measure.getElementsByTagName("note");
			for (int j = 0; j < noteElements.getLength(); j++) {
				Element noteElement = (Element) noteElements.item(j);
				Element pitch = (Element) noteElement.getElementsByTagName("pitch").item(0);
				Element pause = (Element) noteElement.getElementsByTagName("pause").item(0);

				if (pitch != null) {
					
					if (noteElement.getElementsByTagName("grace").getLength() > 0)
						continue;
					
					String tone = pitch.getElementsByTagName("step").item(0).getChildNodes().item(0).getTextContent();

					Element alterElement = (Element) pitch.getElementsByTagName("alter").item(0);
					short alter = 0;
					if (alterElement != null)
						alter = Short.parseShort(alterElement.getTextContent());

					short octave = Short.parseShort(((Element) noteElement.getElementsByTagName("octave").item(0)).getTextContent());

					float duration = (Float.parseFloat(((Element) noteElement.getElementsByTagName("duration").item(0)).getTextContent()) / divisions) / tempo;

					tones.add(new Tone(getToneNumber(tone, alter, octave), duration));
				}
			}
		}
		
		debugStream.println("Found " + tones.size() + " notes.");
		return tones.toArray(new Tone[tones.size()]);
	}

	Frequency[] getFrequencies(Tone[] tones) {
		debugStream.println("Calculating frequencies...");
		List<Frequency> frequencies = new ArrayList<>();

		for (Tone tone : tones) {
			frequencies.add(new Frequency(tone));
		}

		return frequencies.toArray(new Frequency[frequencies.size()]);
	}

	public boolean isPartwise(Document document) {
		return document.getDocumentElement().getNodeName().equals("score-partwise");
	}

	void debug(int measure, String message) {
		debugStream.println("[" + measure + "] " + message);
	}

	int getToneNumber(String tone, short alter, short octave) {
		return tone.equals("pause") ? Integer.MIN_VALUE : "C-D-EF-G-A-B".indexOf(tone) + alter + octave * 12 - 57; //57 anger a1 som stämton. (0)
	}
	String getBeamingType(int indexInMeasure, int notesInMeasure) {
		if (indexInMeasure % 8 == 0)
			return "begin";
		if (indexInMeasure % 8 == 7 || indexInMeasure == notesInMeasure - 1)
			return "end";
		return "continue";
	}
	
	static Part[] getParts(Document document) {
		List<Part> parts = new ArrayList<>();
		NodeList partsNodeList = document.getElementsByTagName("score-part");
		
		for (int i = 0; i < partsNodeList.getLength(); i++) {
			NodeList names = ((Element) partsNodeList.item(i)).getElementsByTagName("part-name");
			Element name = (Element) names.item(0);
			
			if (name == null) {
				parts.add(new Part("Namnlös del", i));
				continue;
			}
			
			parts.add(new Part(name.getTextContent(), i));
		}
		return parts.toArray(new Part[0]);
	}

	public Converter() {
		this(System.out);
	}

	public Converter(PrintStream debugStream) {
		this.debugStream = debugStream;
	}

}
