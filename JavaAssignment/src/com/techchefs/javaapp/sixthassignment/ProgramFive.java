package com.techchefs.javaapp.sixthassignment;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/* USE CASE :
 * ProgramFive is a main test class 
 * to display the numbers in a range using lambda expression
 */

//SOLUTION :
public class ProgramFive {

	public static void main(String[] args) {

		InterfaceFive i = (a, b) -> {

			int k = 0;

			for (int j = a; j <= b;) {

				k = j;
				j++;
				System.out.println("numbers are :" + k);
			}
			return 0;

		};

		int r = i.range(10, 20);

	} //end of main
} //end of class
