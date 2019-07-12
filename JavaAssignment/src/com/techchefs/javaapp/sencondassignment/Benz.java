package com.techchefs.javaapp.sencondassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * Benz is a child class of car class
 */

//SOLUTION :

@Log
public class Benz extends Car {

	void drive() {
		log.info("Drive Benz car");
	}//end of main

}//end of class
