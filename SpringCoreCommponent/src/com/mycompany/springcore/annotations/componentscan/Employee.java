package com.mycompany.springcore.annotations.componentscan;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public void showEmpDetails() {
		System.out.println("Employee name: Abhik");
		System.out.println("Employee Job: Driver");
	}
}
