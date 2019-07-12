package com.techchefs.javaapp.fifthassignment;

/* USE CASE :
 * PrgmEightTest is a main method class to catch the custom exception
 *  
 */

//SOLUTION :
public class PrgmEightTest {

	public static void main(String[] args) {
		
		PrgmEightUncheckedException p = new PrgmEightUncheckedException();
		
		try {
		p.division(20, 0);
		}catch (CustomUncheckedException e) {

			e.printStackTrace();
		}
	}
}//End Of class
