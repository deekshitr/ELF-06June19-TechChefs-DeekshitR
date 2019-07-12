package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternFive is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternFive {

	public static void main(String[] args) {

		int r=4 , i , j , space;
		
		for(i=0 ; i<r ; i++)
		{
			for(space=0 ; space<i ; space++)
			{
				System.out.print(" ");
			}
			
			for(j=4 ; j>i ; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}//end of main

}//end of class
