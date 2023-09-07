package com.mycom.giet;

public class Student {
	int rollno;
	String name;
	float marks;
	public void showDetails() {
		rollno = 1001;
		name = "Bhanu";
		marks =95.67f;
		
		System.out.println("Student rollno IS: "+rollno);
		System.out.println("Student Name is : "+name);
		System.out.println("Student marks is : "+marks);
	}
}
