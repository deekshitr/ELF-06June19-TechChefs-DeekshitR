package com.techchefs.javaapp.sixthassignment;

/* USE CASE :
 * ProgramThree is a main test class 
 * to display a message using lambda expression
 */

//SOLUTION :
public class ProgramThree {

	public static void main(String[] args) {
		
		InterfaceThree i = s -> s.toString();
		
		String m = i.msg("Hi..My name is nistha");
		
		System.out.println(m);
	} //End Of main
} //End Of main
