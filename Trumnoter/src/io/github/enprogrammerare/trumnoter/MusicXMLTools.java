package io.github.enprogrammerare.trumnoter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Contains some static methods for generating MusicXML elements.
 * @author en-programmerare
 *
 */
public class MusicXMLTools {
	
	/**
	 * Creates a {@code<divisions>} element to specify the number of divisions.<br>
	 * It can be placed inside of an {@code <attributes>} element.
	 * @param divisions Number of divisions.
	 * @param template 
	 * @return A divisions element.
	 */
	public static Element createDivisionsAttributeElement(int divisions, Document template) {
		Element divisionsElement = template.createElement("divisions");
		divisionsElement.appendChild(template.createTextNode(String.valueOf(divisions)));
		return divisionsElement;
	}
	
	/**
	 * Creates a {@code<clef>} element to specify the clef.<br>
	 * It can be placed inside of an {@code <attributes>} element.
	 * @param name The name of a clef. Can be {@code G}, {@code F}, {@code C}, {@code percussion}, {@code TAB} or {@code jianpu}. 
	 * @param template An XML document that will contain this new element.
	 * @return A clef element.
	 */
	public static Element createClefAttributeElement(String name, Document template) {
		Element clef = template.createElement("clef");
		Element sign = template.createElement("sign");
		sign.appendChild(template.createTextNode(name));
		clef.appendChild(sign);
		return clef;
	}
	
	
	/**
	 * Creates a {@code<time>} element to specify the time signature.<br>
	 * It can be placed inside of an {@code <attributes>} element.<br>
	 * The following code {@code MusicXMLTools.createTimeSignatureAttributeElement(6, 8, <a template>)}
	 * would yield the following time signature:<br>
	 * 6<br>
	 * 8
	 * @param nominator Number of beats.
	 * @param denominator Type of beat.
	 * @param template An XML document that will contain this new element.
	 * @return A time element.
	 */
	public static Element createTimeSignatureAttributeElement(int nominator, int denominator, Document template) {
		Element time = template.createElement("time");
		Element beats = template.createElement("beats");
		beats.setTextContent(String.valueOf(nominator));
		Element beatType = template.createElement("beat-type");
		beatType.setTextContent(String.valueOf(denominator));
		time.appendChild(beats);
		time.appendChild(beatType);
		return time;
	}
	
	/**
	 * Creates a {@code<staff-details>} element. This changes the number of lines in a staff.<br>
	 * It can be placed inside of an {@code <attributes>} element.<br>
	 * @param numberOfLines Number of lines.
	 * @param template An XML document that will contain this new element.
	 * @return A staff-details element.
	 */
	public static Element createStaffDetailsAttributeElement(int numberOfLines, Document template) {
		Element staffDetails = template.createElement("staff-details");
		Element staffLines = template.createElement("staff-lines");
		staffLines.setTextContent(String.valueOf(numberOfLines));
		staffDetails.appendChild(staffLines);
		return staffDetails;
	}
	
	/**
	 * Creates a {@code<direction>} element with a tempo change.<br>
	 * It can be placed inside of a {@code <measure>} element.<br>
	 * @param display Beats per quarter note. Is displayed.
	 * @param bpm Beats per minute. For playback.
	 * @param template An XML document that will contain this new element.
	 * @return A direction element with a tempo change.
	 */
	public static Element createTempoElement(double display, double bpm, Document template) {
		Element direction = template.createElement("direction");
		direction.setAttribute("placement", "above");
		Element directionType = template.createElement("direction-type");
		Element metronome = template.createElement("metronome");
		Element beatUnit = template.createElement("beat-unit");
		beatUnit.setTextContent("quarter");
		Element perMinute = template.createElement("per-minute");
		perMinute.setTextContent(String.valueOf(display));
		metronome.appendChild(beatUnit);
		metronome.appendChild(perMinute);
		directionType.appendChild(metronome);
		direction.appendChild(directionType);
		Element sound = template.createElement("sound");
		sound.setAttribute("tempo", String.valueOf(bpm));
		direction.appendChild(sound);
		return direction;
	}
	
	/**
	 * Creates a {@code<note>} element, containing a rest.<br>
	 * It can be placed in a {@code <measure>}.
	 * @param duration Divisions this rest lasts.
	 * @param type Type of this rest. Can be "whole", "half", "quarter", "eight", "16th", "32nd"... 
	 * See <a href="https://www.w3.org/2021/06/musicxml40/musicxml-reference/data-types/note-type-value/">reference</a>.
	 * @param wholeMeasure Whether or not to display as a whole-measure rest.
	 * @param template An XML document that will contain this new element.
	 * @return A note element containing a rest.
	 */
	public static Element createRest(int duration, String type, boolean wholeMeasure, Document template) {
		Element note = template.createElement("note");
		Element durationElem = template.createElement("duration");
		durationElem.setTextContent(String.valueOf(duration));
		Element voice = template.createElement("voice");
		voice.setTextContent("1");
		Element typeElem = template.createElement("type");
		typeElem.setTextContent(type);
		
		Element rest = template.createElement("rest");
		rest.setAttribute("measure", wholeMeasure ? "yes" : "no");
		note.appendChild(durationElem);
		note.appendChild(voice);
		note.appendChild(typeElem);
		note.appendChild(rest);
		return note;
	}
	
	/**
	 * Creates an unpitched note. (a {@code <note>} element with a {@code<unpitched>} element inside.)
	 * Place in {@code <measure>}.
	 * @param duration Divisions this rest lasts.
	 * @param type Type of this rest. Can be "whole", "half", "quarter", "eight", "16th", "32nd"... 
	 * See <a href="https://www.w3.org/2021/06/musicxml40/musicxml-reference/data-types/note-type-value/">reference</a>.
	 * @param beamingType Beaming type. Can be "begin", "end" or "continue".
	 * @param displayAsNote Which note this should be displayed as.
	 * @param displayOnOctave Which octave this note should be displayed on.
	 * @param instrumentId The instrument ID that should play this note.
	 * @param template An XML document that will contain this new element.
	 * @return An unpitched note element.
	 */
	public static Element createUnpitchedNote(int duration, String type, String beamingType, 
			String displayAsNote, int displayOnOctave, String instrumentId, Document template) {
		Element note = template.createElement("note");
		Element durationElem = template.createElement("duration");
		durationElem.setTextContent(String.valueOf(duration));
		Element voice = template.createElement("voice");
		voice.setTextContent("1");
		Element typeElem = template.createElement("type");
		typeElem.setTextContent(type);
		Element beam = template.createElement("beam");
		beam.setAttribute("number", "1");
		beam.setTextContent(beamingType);

		Element unpitched = template.createElement("unpitched");
		Element displayStep = template.createElement("display-step");
		Element displayOctave = template.createElement("display-octave");
		Element instrument = template.createElement("instrument");
		displayStep.setTextContent(displayAsNote);
		displayOctave.setTextContent(String.valueOf(displayOnOctave));
		instrument.setAttribute("id", instrumentId);
		unpitched.appendChild(displayStep);
		unpitched.appendChild(displayOctave);

		note.appendChild(unpitched);
		note.appendChild(durationElem);
		note.appendChild(voice);
		note.appendChild(typeElem);
		note.appendChild(beam);
		note.appendChild(instrument);
		
		return note;
	}
	
	
	
	
	private MusicXMLTools() {}

}
