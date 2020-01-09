package com.h2kinfosys.spring;

public class Country {
	
	public Country() {
		System.out.println("Country Created");
	}
	
	private String countryName;

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
