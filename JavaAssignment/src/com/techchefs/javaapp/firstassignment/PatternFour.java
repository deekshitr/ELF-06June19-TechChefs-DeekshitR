package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternFour is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternFour {

	public static void main(String[] args) {

		int r=4 , i , j , space;
		
		for(i=0 ; i<4 ; i++)
		{
			for(space=4 ; space>i ; space--)
			{
				System.out.print(" ");
			}
			
			for(j=0 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}//end of main
	
	
}//end of class
