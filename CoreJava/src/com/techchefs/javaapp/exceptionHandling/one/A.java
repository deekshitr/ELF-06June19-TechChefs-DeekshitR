package com.techchefs.javaapp.exceptionHandling.one;

public class A {
	
	void getName(String name) {
		if(name.length() >= 5) {
			System.out.println("valid name");
		} else {
			throw new InvalidNameException("Invalid name");
		}
	}
}
