package com.techchefs.javaapp.firstassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmOne is a main test class 
 * to print numbers
 */

//SOLUTION :
@Log
public class PrgmOne {

	public static void main(String[] args) {

		int num = 5;

		for (int i = 1; i <= num; i++) {
			log.info("number :" + i);
		}
	}//end of main

}//end of class
