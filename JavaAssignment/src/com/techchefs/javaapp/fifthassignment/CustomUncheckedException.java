package com.techchefs.javaapp.fifthassignment;

/* USE CASE :
 * CustomUncheckedException is a custom exception class 
 * for the unchecked exception
 */

//SOLUTION :

public class CustomUncheckedException extends RuntimeException{
	
	private String msg = "Number can't be divide by zero";
	
	public CustomUncheckedException() {
		
	}
	
	public String err() {
		return msg;
	}

	@Override
	public String toString() {
		return "CustomUncheckedException [msg=" + msg + "]";
	}
	
	
	
	

} //end of class
