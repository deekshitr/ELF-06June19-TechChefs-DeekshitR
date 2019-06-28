package com.techchefs.assessment.four;

import java.util.Arrays;

public class MaximumTemperatureException extends RuntimeException {

	String message;
	
	MaximumTemperatureException() {
		message = "High server room temperature";
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
