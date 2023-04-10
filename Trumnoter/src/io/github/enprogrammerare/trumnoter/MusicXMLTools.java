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
	
	
	
	
	private MusicXMLTools() {}

}
