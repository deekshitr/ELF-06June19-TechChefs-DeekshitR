package com.techchefs.javaapp.exceptionHandling.one;

public class Irctc {
	
	void bookIrctc() {
		try {
			System.out.println("bookIrctc started");
			int i =10;
			System.out.println(i/0);
			
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception occured in bookIrctc");
			throw ae;
			
		} finally {
			System.out.println("bookIrctc ended");
		}
		
		
	}
}
