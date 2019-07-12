package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * CowPrgmOne is a child class 
 *have one method sound()
 * 
 */

//SOLUTION :
import lombok.extern.java.Log;

@Log
public class CowPrgmOne extends AnimalPrgmOne{

	public void sound() {
		log.info("Cow sound method");
	}//end of method
}//end of main
