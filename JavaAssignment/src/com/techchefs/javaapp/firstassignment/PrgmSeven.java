package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PrgmSeven is a main test class 
 * to print number
 */

//SOLUTION :
public class PrgmSeven {

	public static void main(String[] args) {

		int num = 100 , i ;
		
		for(i=1 ; i<=num ; i++)
		{
			int count=0;
			for(int j=2 ; j<i ; j++)
			{
				if(i%j == 0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i + " ");
			}
			
		}
		
		
	}//end of main

}//end of class
