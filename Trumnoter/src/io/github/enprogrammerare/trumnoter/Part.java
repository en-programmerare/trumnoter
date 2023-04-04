package io.github.enprogrammerare.trumnoter;

public record Part(String name, int number) {
	@Override
	public String toString() {
		return name;
	}
}
