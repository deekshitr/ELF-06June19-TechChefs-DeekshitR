package com.techchefs.javaapp.exceptionHandling.two;

public class InsufficentBalanceException extends Exception {
	private String message = "Insufficient balance";

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	
}
