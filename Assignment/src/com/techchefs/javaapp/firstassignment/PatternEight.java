package com.techchefs.javaapp.firstassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * PatternEight is a main test class 
 * to print a pattern
 */

//SOLUTION :
@Log
public class PatternEight {

	public static void main(String[] args) {
		
		int i, j, space;
		for (i = 0; i < 4; i++) {
			for (space = 4; space > i; space--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k <= i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (i = 0; i < 4; i++) {
			for (space = 0; space <= i; space++) {
				System.out.print(" ");
			}

			for (j = 3; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 3; k > i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

	} //end of main

}//end of class
