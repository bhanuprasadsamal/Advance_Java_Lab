package com.mycompany.springcore.annotations.componentscan;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scnr=new Scanner(System.in);
		Customer customer = (Customer) context.getBean("customer");
		Employee employee= (Employee) context.getBean("employee");
		customer.showCustomerDetails();
		employee.showEmpDetails();
		
	}
}
