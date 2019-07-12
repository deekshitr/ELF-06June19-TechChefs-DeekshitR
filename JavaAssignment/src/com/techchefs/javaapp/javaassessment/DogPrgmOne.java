package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * DogPrgmOne is a child class 
 *have one method sound()
 * 
 */

//SOLUTION :
import lombok.extern.java.Log;

@Log
public class DogPrgmOne extends AnimalPrgmOne{

	public void sound() {
		log.info("Dog sound method");
	}//end of method
}//end of class
