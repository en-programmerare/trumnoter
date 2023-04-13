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

/**
 * This class is responsible for converting a MusicXML document to drum sheet music.
 * @author en-programmerare
 *
 */
public class Converter {

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
		
		SheetMusicElement[] elements = getTones(document, partNumber);
		Element part = (Element) template.getElementsByTagName("part").item(0);
		int numberOfBars = 0;
		
		debugStream.println("Generating document.");
		for (SheetMusicElement element : elements) {
			numberOfBars++;
			
			Element measure = template.createElement("measure");
			measure.setAttribute("number", String.valueOf(numberOfBars));
			
			Element attributes = template.createElement("attributes");
			
			//Klav och sånt krävs bara en gång.
			if (numberOfBars == 1) {
				//8 divisions är hårdkodat. Alla beräkningar bygger på det.
				attributes.appendChild(MusicXMLTools.createDivisionsAttributeElement(8, template));
				attributes.appendChild(MusicXMLTools.createClefAttributeElement("percussion", template));
			}
			
			// En linje per notrad i trumnoter.
			attributes.appendChild(MusicXMLTools.createStaffDetailsAttributeElement(1, template));
			
			if (element.isRest()) {
				double minutes = element.getDuration();
				
				measure.appendChild(MusicXMLTools.createTempoElement(1 / minutes, 1 / minutes, template));
				measure.appendChild(MusicXMLTools.createRest(8, "quarter", true, template));
				
				attributes.appendChild(MusicXMLTools.createTimeSignatureAttributeElement(1, 4, template));
				
			}
			//Annars = om detta är en not
			else {
				double bpm = element.getFrequency(); // Hur många BPM takten ska ha.
				double minutes = element.getDuration(); // Hur många minuter tonen ska vara.
				int numberOfNotes = (int) Math.round(bpm * minutes * 32 / 4); // antal 32-delsnoter som krävs.

				attributes.appendChild(MusicXMLTools.createTimeSignatureAttributeElement(numberOfNotes, 32, template));
				
				// Skapa en tempoangivelse
				measure.appendChild(MusicXMLTools.createTempoElement(bpm, bpm, template));
				
				//Den sista tonen ersätts av en paus om inte anslag ska göras.
				int numberOfNotesToCreate = element.shouldSlur() ? numberOfNotes : numberOfNotes - 1;
				

				// Skapa alla trumslag i takten.
				for (int i = 0; i < numberOfNotesToCreate; i++)	
					measure.appendChild(MusicXMLTools.createUnpitchedNote(1, "32nd", getBeamingType(i, numberOfNotes), "F", 4, "P1-I77", template));
				
				//Skapa en extra paus på slutet istället för den sista tonen om anslag ska göras.
				if (!element.shouldSlur())
					measure.appendChild(MusicXMLTools.createRest(1, "32nd", false, template));
			}
			measure.appendChild(attributes);
			part.appendChild(measure);
		}
		
		debugStream.println("Done.");
		return template;
	}

	/**
	 * Returns a list of all tones in the document.
	 * @param document   A MusicXML document.
	 * @param partNumber The part number to read.
	 * @return Array of tones.
	 */
	SheetMusicElement[] getTones(Document document, int partNumber) {
		debugStream.println("Interpreting...");
		List<SheetMusicElement> tones = new ArrayList<>();

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
				Element rest = (Element) noteElement.getElementsByTagName("rest").item(0);
				
				//Om detta är en not
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
					
					NodeList ties = noteElement.getElementsByTagName("tie");
					NodeList slurs = noteElement.getElementsByTagName("slur");
					
					boolean performSlur = false;
					for (int t = 0; t < ties.getLength(); t++) {
						Element tie = (Element) ties.item(t);
						
						if (tie.getAttribute("type").equals("start")) {
							performSlur = true;
							break;
						}
					}
					
					if (!performSlur)
						for (int t = 0; t < slurs.getLength(); t++) {
							Element slur = (Element) slurs.item(t);
						
							if (slur.getAttribute("type").equals("start")) {
								performSlur = true;
								break;
							}
						}
					//Saker här nedanför körs alltid.
					
					
					tones.add(SheetMusicElement.createNote(tone, alter, octave, duration, performSlur));
				}
				else if (rest != null) {
					float duration = (Float.parseFloat(((Element) noteElement.getElementsByTagName("duration").item(0)).getTextContent()) / divisions) / tempo;
					tones.add(SheetMusicElement.createRest(duration));
				}
			}
		}
		
		debugStream.println("Found " + tones.size() + " notes.");
		return tones.toArray(new SheetMusicElement[tones.size()]);
	}

	
	/**
	 * Returns whether the specified Musicxml document is partwise.
	 * @param document Document to check.
	 * @return Whether partwise.
	 */
	public static boolean isPartwise(Document document) {
		return document.getDocumentElement().getNodeName().equals("score-partwise");
	}

	private void debug(int measure, String message) {
		debugStream.println("[" + measure + "] " + message);
	}
	
	/**
	 * Returns the beaming type that should be used for this note
	 * @param indexInMeasure The index of the current 32nd note in this measure.
	 * @param notesInMeasure The total number of 32nd notes in the measure.
	 * @return "begin", "continue", or "end", which can be used in this note's MusicXML element.
	 */
	String getBeamingType(int indexInMeasure, int notesInMeasure) {
		if (indexInMeasure % 8 == 0)
			return "begin";
		if (indexInMeasure % 8 == 7 || indexInMeasure == notesInMeasure - 1)
			return "end";
		return "continue";
	}
	
	/**
	 * Returns a list of parts in this MusicXML document.
	 * @param document A partwise MusicXML document.
	 * @return Whether the document is partwise.
	 * @throws IllegalArgumentException If the document is not partwise.
	 */
	public static Part[] getParts(Document document) {
		if (!isPartwise(document))
			throw new IllegalArgumentException("Document is not partwise.");
		
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
	
	/**
	 * Creates a converter that uses {@code System.out} for debug information.
	 */
	public Converter() {
		this(System.out);
	}
	
	/**
	 * Creates a converter that uses the supplied stream for debug information.
	 * @param debugStream Stream to print debug info to.
	 */
	public Converter(PrintStream debugStream) {
		this.debugStream = debugStream;
	}

}
