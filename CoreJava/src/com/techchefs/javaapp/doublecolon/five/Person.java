package com.techchefs.javaapp.doublecolon.five;

import lombok.extern.java.Log;

@Log
public class Person {
	
	String name;
	double height;
	char gender;
	 
	public Person(String name, double height, char gender) {
		
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", gender=" + gender + "]";
	}
	
}
