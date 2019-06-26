package com.techchefs.javaapp.exeptionhandling.three;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		try {
			
		} catch(ArithmeticException | NullPointerException e) {
			log.info(e.getMessage());
		} catch(Exception e) {
			log.info(e.getMessage());
		}
	}

}
