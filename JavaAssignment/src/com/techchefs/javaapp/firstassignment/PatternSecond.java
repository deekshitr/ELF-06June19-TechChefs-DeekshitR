package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternSecond is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternSecond {

	public static void main(String[] args) {

		int r=5;
		
		for(int i=0 ; i<5 ; i++)
		{
			for(int j=5 ; j>i ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}//end of main

}//end of class
