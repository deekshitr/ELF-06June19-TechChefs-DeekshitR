package com.techchefs.javaapp.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

/* USE CASE :
 * StringSix is a main test class 
 * to reverse the words of a string
 */

//SOLUTION :
@Log
public class StringSix {

	static String rev = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		log.info("ENter the string");
		String s = sc.nextLine();

		String[] s1 = s.split(" ");

		int len = s1.length;

		String ans = "";

		for (int i = 0; i < len; i++) {

			String word = s1[i];

			if (i % 2 != 0) {
				for (int j = word.length() - 1; j >= 0; j--) {

					rev = rev + word.charAt(j);
				}
				ans = ans + rev + " ";

				rev = "";
			} else {
				ans = ans + s1[i] + " ";
			}
		}

		log.info("Reverse string is : " + ans);
	} //end of main

}//end of class
