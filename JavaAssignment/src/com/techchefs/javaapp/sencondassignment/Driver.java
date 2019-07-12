package com.techchefs.javaapp.sencondassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * Driver is a parent class 
 */

//SOLUTION :

@Log
public class Driver {

	public void drive(Car c) {
		if (c instanceof Benz) {
			log.info("driving Benz Car");
		} else if (c instanceof Audi) {
			log.info("driving Audi Car");
		}

	}
}//end of class
