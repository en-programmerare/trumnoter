package io.github.enprogrammerare.trumnoter;

import java.util.HashMap;

/**
 * A quick and dirty class to handle translations.
 * @author en-programmerare
 *
 */
public class Messages {
	
	private HashMap<String, Language> languages = new HashMap<>();
	private String language;
	
	private static final String[] translationKeys = 
		{
			"window.title", "window.content", "filter.name", "dialogue.part.title",
			"dialogue.part.content", "dialogue.error.title", "dialogue.error.content",
			"parts.noname"
		};
	
	public Messages(String language) {
		Language swedish = new Language("sv").setTranslationKeys(translationKeys).setTranslations(
				"Trumnoter", "Till trumnoter", "Okomprimerade MusicXML-filer", "Val av stämma", "Vänligen välj en stämma att konvertera:",
				"Fel", "Ett fel har uppstått under programkörning och dina noter kunde ej konverteras. På nästa sida finns mer information.",
				"Namnlös stämma");
		
		Language english = new Language("en").setTranslationKeys(translationKeys).setTranslations(
				"Sheet Music for Drums", "To drum sheet music", "Uncompressed MusicXML files", "Choose part...", "Please choose a part to convert:",
				"Error", "An error has occurred during in the program, and your sheet music couldn't be converted. There is more information on the next page.",
				"Part without name");
		
		languages.put(swedish.getName(), swedish);
		languages.put(english.getName(), english);
		
		this.language = language;
	}
	
	public String get(String code) {
		return languages.containsKey(language) ? languages.get(language).get(code) : languages.get("en").get(code);
	}

}
