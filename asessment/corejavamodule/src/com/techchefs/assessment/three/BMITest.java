package com.techchefs.assessment.three;

import java.util.logging.Logger;

public class BMITest {
	static Logger log = Logger.getLogger("StudentTopperTest");
	public static void main(String[] args) {
		
		CalculateBMI cb = new CalculateBMI();
		double bmi = cb.bmi(72, 1.0);
		
		String bmiStatus = cb.bmiStatus(bmi);
		
		log.info("bmi: "+bmi+ " which is "+bmiStatus);
	}

}
