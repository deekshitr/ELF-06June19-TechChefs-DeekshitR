package com.techchefs.javaapp.exceptionHandling.two;

public class Example1 {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		
		try {
			b1.withDraw(156000);
		} catch (InsufficentBalanceException e) {
			System.out.println(e);
		}

	}

}
