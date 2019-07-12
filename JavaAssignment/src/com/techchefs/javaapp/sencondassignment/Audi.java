package com.techchefs.javaapp.sencondassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * Audi is a child class of car class
 */

//SOLUTION :

@Log
public class Audi extends Car {

	void drive() {
		log.info("Drive Audi Car");
	}

}//end of class
