package com.techchefs.javaapp.sixthassignment;

/* USE CASE :
 * ProgramFour is a main test class 
 * to calculate square using lambda expression
 */

//SOLUTION :
public class ProgramFour {

	public static void main(String[] args) {
		
		InterfaceFour i = a -> a * a;
		
		int s = i.square(4);
		System.out.println("Square is: " + s);
	} //end of main
}//end of class
