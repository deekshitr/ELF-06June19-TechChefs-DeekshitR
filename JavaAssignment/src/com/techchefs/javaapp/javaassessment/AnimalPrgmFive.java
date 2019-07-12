package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

/* USE CASE :
 * AnimalPrgmFive is a class to calculate the number of objects created of this class
 * 
 */

//SOLUTION :
@Log
public class AnimalPrgmFive {
	static int count;

	public AnimalPrgmFive() {

		count++;
	}

	public void getAnimal() {

		log.info("Animal's getAnimal method");

	}

}
