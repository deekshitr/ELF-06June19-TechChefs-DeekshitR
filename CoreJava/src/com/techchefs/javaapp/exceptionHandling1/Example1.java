package com.techchefs.javaapp.exceptionHandling1;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main started");
		try {
			Paytm p = new Paytm();
			p.bookPaytm();
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception occured in main");
		} finally {
			System.out.println("main ended");
		}

	}

}
