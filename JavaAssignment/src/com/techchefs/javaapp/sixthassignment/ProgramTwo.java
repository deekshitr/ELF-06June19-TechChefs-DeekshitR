package com.techchefs.javaapp.sixthassignment;

/* USE CASE :
 * ProgramTwo is a main test class 
 * to factorial using lambda expression
 */

//SOLUTION :
public class ProgramTwo {

	public static void main(String[] args) {

		InterfaceTwo i = a -> {
			int f = 1;
			for (int j = 1; j <= a; j++) {
				f = f * j;
			}
			return f;
		};

		int fac = i.fact(6);
		System.out.println("factorial of a number is " + fac);
	}// End Of main
}// End Of class
