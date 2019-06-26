package com.techchefs.javaapp.exceptionHandling.two;

public class Bank {
	
	int balance = 10000;
	
	void withDraw(double money) throws InsufficentBalanceException {
		if (balance > money) {
			System.out.println("withdrawn");
		} else {
			throw new InsufficentBalanceException();
		}
	}
}
