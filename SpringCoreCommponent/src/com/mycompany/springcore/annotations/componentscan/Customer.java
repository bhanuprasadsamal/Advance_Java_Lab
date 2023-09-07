package com.mycompany.springcore.annotations.componentscan;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	int id;
	String name,city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void showCustomerDetails() {
		System.out.println("Name: Bhanu");
		System.out.println("City: Jajpur");
	}
}
