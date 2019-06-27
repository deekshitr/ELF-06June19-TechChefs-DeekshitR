package com.techchefs.javaapp.basic.one;

public class Example16 {
	
	static double add(double a, double b) {
		return a+b;
	}
	
	static double multiply(double a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		double x1 = add(5.234,2);
		double x2 = multiply(5.1,2);
		System.out.println("Sum : "+ x1);
		System.out.println("Multiply : "+x2);
	}

}
