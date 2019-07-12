package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * DogPrgmOne is a child class 
 *have one method sound()
 * 
 */

//SOLUTION :
import lombok.extern.java.Log;

@Log
public class LionPrgmFive extends AnimalPrgmOne {
	static int lionCount;

	public LionPrgmFive() {
		lionCount++;

	}

	public void sound() {
		log.info("Lion sound method");
	}// end of method
}// end of class
