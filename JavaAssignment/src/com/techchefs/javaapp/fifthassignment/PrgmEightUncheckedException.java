package com.techchefs.javaapp.fifthassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmEightUncheckedException is a class to throw the custom exception
 *  
 */

//SOLUTION :
@Log
public class PrgmEightUncheckedException {
	
	int a , b , div;
	
	/*	It's a division method to divide two numbers 
	 * 
	 */
	
	 void division(int a,int b) throws CustomUncheckedException{
		 
		 div = a/b;
		 
		 if(div > 0) {
			 
			log.info("Division is :" + div); 
			
		 } else {
			 throw new CustomUncheckedException();
		 }
	 }

}//End Of class
