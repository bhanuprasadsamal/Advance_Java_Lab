package com.mycompany.springcore.autowiring.annotation.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCountry {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country countryObj = (Country)appContext.getBean("countryBean");
		String countryName=countryObj.getCountryName();
		System.out.println(countryName);
		Capital capital=countryObj.getCapital();
		String capitalName=capital.getCapitalName();
		
		System.out.println(capitalName+"is capital of"+countryName);
	}

}
