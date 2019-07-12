package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * DogPrgmOne is a child class 
 *have one method sound()
 * 
 */

//SOLUTION :
import lombok.extern.java.Log;

@Log
public class DogPrgmFive extends AnimalPrgmOne {
	static int dogCount;

	public DogPrgmFive() {
		dogCount++;

	}

	public void sound() {
		log.info("Dog sound method");
	}// end of method
}// end of class
