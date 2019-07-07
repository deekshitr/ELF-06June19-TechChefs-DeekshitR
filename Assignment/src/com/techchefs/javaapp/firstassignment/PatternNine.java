package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternNine is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternNine {

	public static void main(String[] args) {
		int i, j, num = 7;

		for (i = 0; i < num; i++) {

			for (j = 0; j < num; j++) {
				if(i == num/2 && j<num) {
					System.out.print("*");
				} 
				else if (j == num/2 && i<num) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}

			System.out.println();

		}

	}//end of main

}//end of class
