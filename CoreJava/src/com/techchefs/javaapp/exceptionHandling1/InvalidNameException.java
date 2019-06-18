package com.techchefs.javaapp.exceptionHandling1;

public class InvalidNameException extends RuntimeException {
	
	private String message;
	
	InvalidNameException(String message) {
		this.message = message;
	}
	
	
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}

	
	
	
}
