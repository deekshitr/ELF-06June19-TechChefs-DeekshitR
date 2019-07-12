package com.techchefs.javaapp.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

/* USE CASE :
 * String5 is a main test class 
 * to print the string with its length
 */

//SOLUTION :
@Log
public class String5 {

	public static void main(String[] args) {
		String rev = "";
		String revString = "";

		log.info("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String s1[] = s.split(" ");

		int len1 = s.length();
		int len = s1.length;

		for (int i = 0; i <= len - 1; i++) {
			for (int j = s1[i].length()-1 ; j >= 0; j--) {

				rev = rev + s1[i].charAt(j);
			}
			
		}
	//	revString = revString+ " " + rev;
		log.info("Reverse string is " + rev + " ");
	}//end of main

}//end of class
