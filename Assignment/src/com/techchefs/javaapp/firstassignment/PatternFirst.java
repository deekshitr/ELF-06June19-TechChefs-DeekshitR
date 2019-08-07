package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternFirst is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternFirst {

	public static void main(String[] args) {
		int r=5;
		
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}//end of main

}//end of class
