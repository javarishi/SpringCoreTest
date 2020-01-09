package com.h2kinfosys.spring;

public class HelloWorld {
	
	private String message;
	private String language;
	private Country country;
	
	public HelloWorld(String lang, String zipCode) {
		this.setLanguage(lang);
		System.out.println("Zip Code Entered :: " + zipCode);
	}
	
	public void start() {
		System.out.println("Hello World Init Method");
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		if(this.getLanguage().equals("English")) {
			return message;
		}else {
			return "Language Unknown";
		}
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void end() {
		System.out.println("Hello World Destroy Method");
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

	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}	
	
	
	





}
