package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PatternSeven is a main test class 
 * to print a pattern
 */

//SOLUTION :
public class PatternSeven {

	public static void main(String[] args) {

		int i, j, space;

		for (i = 1; i <= 4; i++) {
			for (space = 4; space > i; space--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 1; i <= 4; i++) {
			for (space = 1; space <= i; space++) {
				System.out.print(" ");
			}

			for (j = 3; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();

		}
	}//end of main

}//end of class
