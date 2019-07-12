package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PrgmFour is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PrgmFour {

	public static void main(String[] args) {

		int num=100;
		
		for(int i=50 ; i<=100 ; i++)
		{
			if(i%2 == 0 && i%5 == 0)
			{
				System.out.println("Even numbers didvided by 5 are :" + i);
			}
		}
	} //end of main

}//end of class
