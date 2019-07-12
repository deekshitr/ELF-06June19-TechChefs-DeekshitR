package com.techchefs.javaapp.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

/* USE CASE :
 * String7 is a main test class 
 * to swap the words of a string
 */

//SOLUTION :
@Log
public class String7 {

	public static void main(String[] args) {
		String temp;

		Scanner sc = new Scanner(System.in);

		log.info("Enter the string");
		String s = sc.nextLine();

		String[] s1 = s.split(" ");

		int len = s1.length;

		int i;
		String ans = "";

			temp = s1[0];
			s1[0] = s1[len - 1];
			s1[len - 1] = s1[(len - 1) / 2];
			s1[(len - 1) / 2] = temp;

		
		for (i = 0; i <= len - 1; i++) {

			ans = ans + s1[i] + " ";
		}
		

		log.info(ans);
	} //end of main

}//end of class
