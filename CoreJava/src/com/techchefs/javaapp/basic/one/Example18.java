package com.techchefs.javaapp.basic.one;

public class Example18 {
	
	static double bmi (int w, double h) {
		
		double bmiCal = w/(h*h);
		
		return bmiCal;
		
	}
	
	static String bmiStatus (double bmi) {
		
		if (bmi >= 30 && bmi<=39.9) {
			return "you're in the obese range";
		} else if (bmi >= 25 && bmi<=29.9) {
			return "you're in the overweight range";
		} else if (bmi >= 18.5 && bmi<=24.9) {
			return " you're in the healthy weight range";
		} else if (bmi <= 18.5) {
			return " you're in the underweight range";
		} else {
			return "invalid BMI";
		}
		
	}

	public static void main(String[] args) {
		
		double x= bmi(72,1.72);
		String bmiStatus =  bmiStatus(x);
		System.out.println(bmiStatus);
	}

}
