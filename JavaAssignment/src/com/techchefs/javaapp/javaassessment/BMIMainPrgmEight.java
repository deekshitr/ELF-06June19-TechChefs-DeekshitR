package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

@Log
public class BMIMainPrgmEight {

	public static void main(String[] args) {

		BMIPgrmEight c = new BMIPgrmEight();

		c.height = 150;
		c.weight = 40;
		c.calBMI();
		c.condition();

		log.info("" + c.calBMI());

	}// end of main

}// end of class
