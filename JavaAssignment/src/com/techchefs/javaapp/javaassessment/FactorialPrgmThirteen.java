package com.techchefs.javaapp.javaassessment;

import java.util.function.Function;

import lombok.extern.java.Log;

/* USE CASE :
 * FactorialPrgmThirteen is a main class 
 *to calculate the Factorial of a number using functional interface
 * 
 */

//SOLUTION :
@Log
public class FactorialPrgmThirteen {
	public static void main(String[] args) {
		Function<Integer, Integer> fun = a -> {
			int x = 1;
			for(int i=1 ; i<=a ; i++) {
				x = x*i;
			}
			return x;	
		};
		
		Integer result = fun.apply(5);
		log.info("Factorial is :" + result);
	}//end of main

}//end of class
