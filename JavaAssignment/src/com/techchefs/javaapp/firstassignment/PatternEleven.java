package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternEleven is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternEleven {

	public static void main(String[] args) {

		int i, j, num = 20;

		for (i = 0; i < num; i++) {

			for (j = 0; j < num; j++) {
				if (i == 0 || i + j == num - 1 || j == 0 || i == j || j == num - 1 || i == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

	}//end of main
}//end of class 
