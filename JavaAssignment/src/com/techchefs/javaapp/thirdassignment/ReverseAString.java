package com.techchefs.javaapp.thirdassignment;

/* USE CASE :
 * ReverseAString is a main test class 
 * to reverse a string
 */

//SOLUTION :
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String rev="";

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int len = s.length();
		
		for(int i=len-1 ; i>=0 ; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse of the string is " + rev);
	} //end of main

}//end of class
