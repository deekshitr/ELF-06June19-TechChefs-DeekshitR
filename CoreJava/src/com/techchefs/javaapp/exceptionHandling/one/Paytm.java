package com.techchefs.javaapp.exceptionHandling.one;
public class Paytm {
	
	void bookPaytm() {
		try {
			System.out.println("bookPaytm started");
			Irctc i = new Irctc();
			i.bookIrctc();
			
		} catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception occured in bookPaytm");
		} finally {
			System.out.println("bookPaytm ended");
		}
		
	}
}
