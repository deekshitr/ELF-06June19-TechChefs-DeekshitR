package com.techchefs.javaapp.basic.one;

public class Example19 {
	
	static double calcPercentage(double m, double t) {
		
		double percentage = (m/t)*100;
		return percentage;
	}

	public static void main(String[] args) {
		
		double p1 = calcPercentage(556,600);
		System.out.println("Percentage "+p1);
	}

}
