package com.mycompany.springcore.autowiring.annotation.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {
	String countryName;
	@Autowired
	Capital capital;//POJO -dependency
	
	public Country() {
		
	}

	public Country(Capital capital) {
		super();
		
		this.capital = capital;
	}
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	public Capital getCapital() {
		return capital;
	}

}
