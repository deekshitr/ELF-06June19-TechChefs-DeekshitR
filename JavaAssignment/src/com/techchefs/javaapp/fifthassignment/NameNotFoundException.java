package com.techchefs.javaapp.fifthassignment;

/* USE CASE :
 * NameNotFoundException is a custom exception class 
 * for the checked exception
 */

//SOLUTION :
public class NameNotFoundException extends Exception {
	private String msg = "Name is not present";
	
	public NameNotFoundException() {
		
	}
		
public String getString() {
		
		return msg;
	}

	@Override
	public String toString() {
		return "PrgmSevenCustomException [msg = " + msg + "]";
	}
		
		
	
}//End Of class
