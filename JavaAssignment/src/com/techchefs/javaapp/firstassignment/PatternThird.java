package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternThird is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternThird {

	public static void main(String[] args) {

		int r=5 , i , j;
		
		for(i=0 ; i<9 ; i++)
		{
			for(j=0 ; j<=i/2 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(i=0 ; i<5 ; i++)
//		{
//			for(j=4 ; j>i ; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}                                                                                                                         
	} //end of main

}//end of class
