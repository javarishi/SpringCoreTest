package com.h2kinfosys.spring.addons;

public class SpellChecker {
	
	private String language;
	
	public SpellChecker(String language) {
		this.setLanguage(language);
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

}
