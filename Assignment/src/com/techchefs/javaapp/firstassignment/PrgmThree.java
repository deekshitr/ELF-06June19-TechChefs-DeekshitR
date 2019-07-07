package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PrgmThree is a main test class 
 * to print odd no divided by 7
 */

//SOLUTION :
public class PrgmThree {

	public static void main(String[] args) {
		
		int num=100 , oddNum;

		for(int i=1 ; i<=num ; i++)
		{
			if(i%2 != 0 && i%7 == 0)
			{
				System.out.println("Odd numbers divided by 7 are : " + i);
			}
			
		}
	} //end of main

}//end of class
