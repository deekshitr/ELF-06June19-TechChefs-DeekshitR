package com.techchefs.javaapp.thirdassignment;

import java.util.Scanner;

import lombok.extern.java.Log;

/* USE CASE :
 * String4 is a main test class 
 * to print the string with its length
 */

//SOLUTION :
@Log
public class String4 {

	public static void main(String[] args) {

		log.info("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] s1 = s.split(" ");

		int len = s1.length;

		for (int i = 0; i <= len - 1; i++) {
			log.info(s1[i] + s1[i].length() );
		}

	}//end of main

}//end of class
