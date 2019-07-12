package com.techchefs.javaapp.fifthassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmSevenCustomException is a class to store the the name
 *  arand throw the custom exception.
 */

//SOLUTION :
@Log
public class PrgmSevenCustomException extends Exception {

	String name[] = { "Nistha", "Rashmi", "Rahul", "ritu", "Ravi" };
	

	void check(String newName) throws NameNotFoundException {
		
		for(int i=0 ; i<name.length ; i++) {
			
			if(newName.equals(name[i])) {
			log.info("Name is found");	
			}
			
			else {
				throw new NameNotFoundException();
			}
		}
		
	
		
	}//end of method

} //end of class
