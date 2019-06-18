package com.techchefs.javaapp.exceptionHandling1;

public class Example4 {
	public static void main(String[] args) {
		
		System.out.println("main started");
		A a1 = new A();
		
		try {
			a1.getName("nish");
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
		
		System.out.println("main ended");
	}
}
