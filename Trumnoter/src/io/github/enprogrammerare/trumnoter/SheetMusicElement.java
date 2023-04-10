package io.github.enprogrammerare.trumnoter;

/**
 * Represents a note or a rest.
 * @author en-programmerare
 *
 */
public class SheetMusicElement {
	
	/** Contains 2^(1/12) */
	static final double TWELTH_ROOT_OF_TWO = 1.05946309435929;
	/** How many Hz a1 is. */
	static final int TUNING = 440;
	
	private int tone;
	private double duration;
	
	/**
	 * Creates a note.
	 * @param tone The note. a1 is 0, and every semitone is one step.
	 * @param duration The duration of this tone in minutes.
	 * @return A note.
	 */
	public static SheetMusicElement createNote(int tone, double duration) {
		return new SheetMusicElement(tone, duration);
	}
	
	/**
	 * Creates a note.
	 * @param name The name of this note. C, D, E, F, G, A or B.
	 * @param alter -1 = flat  0 = natural   1 = sharp
	 * @param octave The octave. a1 is on octave 0.
	 * @param duration The duration of this tone in minutes.
	 * @return A note.
	 */
	public static SheetMusicElement createNote(char name, short alter, short octave, double duration) {
		int tone = "C-D-EF-G-A-B".indexOf(name) + alter + octave * 12 - 57; //57 anger a1 som stämton. (0)
		return new SheetMusicElement(tone, duration);
	}
	
	/**
	 * Creates a note.
	 * @param name The name of this note. C, D, E, F, G, A or B.
	 * @param alter -1 = flat  0 = natural   1 = sharp
	 * @param octave The octave. a1 is on octave 0.
	 * @param duration The duration of this tone in minutes.
	 * @return A note.
	 */
	public static SheetMusicElement createNote(String name, short alter, short octave, double duration) {
		int tone = "C-D-EF-G-A-B".indexOf(name) + alter + octave * 12 - 57; //57 anger a1 som stämton. (0)
		return new SheetMusicElement(tone, duration);
	}
	
	/**
	 * Creates a rest
	 * @param duration The duration of this rest in minutes.
	 * @return A rest.
	 */
	public static SheetMusicElement createRest(double duration) {
		return new SheetMusicElement(Integer.MIN_VALUE, duration);
	}

	private SheetMusicElement(int tone, double duration) {
		this.tone = tone;
		this.duration = duration;
	}
	
	/**
	 * Returns whether this is a rest.
	 * @return True if rest, false if note.
	 */
	public boolean isRest() {
		return tone == Integer.MIN_VALUE;
	}
	/**
	 * Returns whether this is a note.
	 * @return True if note, false if rest.
	 */
	public boolean isNote() {
		return !isRest();
	}
	
	/**
	 * Returns the duration of this element.
	 * @return Duration, in minutes.
	 */
	public double getDuration() {
		return duration;
	}
	
	/**
	 * Returns the tone of this note.
	 * @return The tone. a1 is 0.
	 * @throws UnsupportedOperationException If this is a rest.
	 */
	public int getTone() {
		if (isRest())
			throw new UnsupportedOperationException("A rest does not have a tone.");
		return tone;
	}
	
	/**
	 * Returns the frequency of this note.
	 * @return The frequency.
	 * @throws UnsupportedOperationException If this is a rest.
	 */
	public double getFrequency() {
		if (isRest())
			throw new UnsupportedOperationException("A rest does not have a frequency.");
		
		 return (TUNING * Math.pow(TWELTH_ROOT_OF_TWO, tone)) * 60 / 32;
	}

}
