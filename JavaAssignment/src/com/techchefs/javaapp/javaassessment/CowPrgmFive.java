package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * CowPrgmOne is a child class 
 *have one method sound()
 * 
 */

//SOLUTION :
import lombok.extern.java.Log;

@Log
public class CowPrgmFive extends AnimalPrgmOne{
	static int cowCount;

	public CowPrgmFive() {
		cowCount++;

	}

	public void sound() {
		log.info("Cow sound method");
	}//end of method
}//end of main
