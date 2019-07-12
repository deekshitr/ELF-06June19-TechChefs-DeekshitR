package com.techchefs.javaapp.fifthassignment;

/* USE CASE :
 * ProgramOne is a class to count the number of objects
 * it is creating
 *  
 */

//SOLUTION :

public class ProgramOne {
	
	static int count=0;
	
	public ProgramOne() {
		count=count+1;
	}
	
	/*	It's a main method to display the count of objects
	 * 
	 */

	public static void main(String[] args) {
		
		ProgramOne p =new ProgramOne();
		ProgramOne p1 =new ProgramOne();
		ProgramOne p2 =new ProgramOne();
		
		System.out.println("No Of objects are: " + ProgramOne.count);
	}
}
