package com.techchefs.assessment.three;

public class CalculateBMI {
	
	public double bmi(int weight,double height) {
		double bmi = weight/(height*height);
		return bmi;
	}
	
	public String bmiStatus(double bmi) {
		if(bmi < 18.5) {
			return "Underweight";
		} else if (bmi == 18.5 && bmi <24.9) {
			return "Normal weight";
		} else if (bmi == 18.5 && bmi <24.9) {
			return "Overweight";
		} else if (bmi > 30) {
			return "Obese";
		} else {
			return "Obese";
		}
		
		
	}
}
