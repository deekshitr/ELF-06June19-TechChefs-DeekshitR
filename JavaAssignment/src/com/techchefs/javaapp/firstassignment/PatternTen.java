package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternTen is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternTen {

	public static void main(String[] args) {

		int i, j, num = 20;

		for (i = 0; i < num; i++) {

			for (j = 0; j < num; j++) {
				if (j - i == (num - 1) / 2 || i + j == (num - 1) / 2 || i + j == (num-1)/2 || i == (num - 1) / 2
						|| j == (num - 1) / 2 || i - j == (num - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
	}//end of main

}//end of class
