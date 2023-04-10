package io.github.enprogrammerare.trumnoter;

import java.util.HashMap;

public class Language {
	
	private String name;
	private String[] keys;
	
	private HashMap<String, String> translations = new HashMap<>();

	public Language(String name) {
		this.name = name;
	}
	
	public Language setTranslationKeys(String ... keys) {
		this.keys = keys;
		return this;
	}
	
	public Language setTranslations(String ... translations) {
		if (keys.length != translations.length) {
			throw new IllegalArgumentException("The arrays 'keys' and 'translations' need to have the same length. (Keys has length " + 
					keys.length + " and translations has length " + translations.length + ")");
		}
		
		for (int i = 0; i < translations.length; i++) {
			this.translations.put(keys[i], translations[i]);
		}
		return this;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String get(String key) {
		String result = translations.get(key);
		
		if (result == null)
			return key;
		
		return result;
	}

}
