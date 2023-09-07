package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.bean.Country;

@Controller
public class CountryController {

	@ModelAttribute
	public Country getCountry(@RequestParam String countryName, @RequestParam long population) {
		// avoiding request.getParameter() to receive form data
		Country country = new Country();
		country.setCountryName(countryName);
		country.setPopulation(population);
		return country;// returned to Country bean of showCountry() method set as @ModelAttribute
	}
	@RequestMapping("/country")
	public String showCountry(@ModelAttribute Country country, ModelMap model) {
		System.out.println("Country Name : " + country.getCountryName());
		System.out.println("Population : " + country.getPopulation());
		//return new ModelAndView("countryDetails", "countryName", country.getCountryName());
		model.addAttribute("countryName", country.getCountryName());
		model.addAttribute("population", country.getPopulation());
		return "countryDetails";//countryDetails.jsp
	}
}