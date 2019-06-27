package com.techchefs.javaapp.basic.two;

class Bmi {
	int weight;
	double height;
	double bmiResult;
	
	double calculateBmi() {
		bmiResult = weight/(height*height);
		return bmiResult;
	}
	
	String bmiState() {
		
		if (bmiResult >=30 && bmiResult<=39.9) {
			return "you're in the obese range";
		} else if (bmiResult>=25 && bmiResult<=29.9) {
			return "you're in the overweight range";
		} else if (bmiResult>=18.5 && bmiResult<=24.9) {
			return "you're in the healthy weight range";
		} else if (bmiResult <18.5) {
			return " you're in the underweight range";
		} else {
			return "Invalid BMI";
		}
		
	}
}

public class Exanmple2 {

	public static void main(String[] args) {
		Bmi b1 = new Bmi();
		b1.weight = 76;
		b1.height = 1.72;
		double bmi1 = b1.calculateBmi();
		String s1 = b1.bmiState();
		System.out.println("Your BMI is "+bmi1+" and " +s1);
		
	}

}
