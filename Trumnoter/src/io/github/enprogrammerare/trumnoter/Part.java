package io.github.enprogrammerare.trumnoter;

/**
 * Represents a part in the sheet music.
 * @param name Name of part.
 * @param number The index of this part in a MusicXML document.
 * @author en-programmerare
 */
public record Part(String name, int number) {
	@Override
	public String toString() {
		return name;
	}
}
