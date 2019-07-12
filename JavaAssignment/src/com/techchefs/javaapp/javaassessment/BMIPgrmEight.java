package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

/* USE CASE :
 * BMIPgrmEight is a class 
 *have two methods calBMI() and condition() to calculate BMI and check the condition of a person
 * 
 */
@Log
public class BMIPgrmEight {

	double weight;
	double height;
	double result;

	public double calBMI() {
		result = (weight) / (height * height);

		return result;
	}

	void condition() {
		if (result < 18.5) {
			log.info("Underweight");
		} else if (result >= 18.5 && result < 24.5) {
			log.info("Normal");
		} else if (result > 24.5 && result <= 29) {
			log.info("overweight");
		} else {
			log.info("obesity");
		}

	}

}//end of class
