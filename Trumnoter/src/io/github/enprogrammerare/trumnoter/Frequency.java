package io.github.enprogrammerare.trumnoter;

public record Frequency(Tone tone, double frequency) {
	
	public Frequency(Tone tone) {
		this(tone, (Converter.TUNING * Math.pow(Converter.TWELTH_ROOT_OF_TWO, tone.tone())) * 60 / 32);
	}
}
