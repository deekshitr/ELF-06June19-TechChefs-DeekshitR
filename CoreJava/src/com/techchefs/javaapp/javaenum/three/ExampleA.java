package com.techchefs.javaapp.javaenum.three;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		String s = "apple";
		
		switch(s) {
			case "apple": log.info("hi apple");
			break;
			case "mango": log.info("hi mango");
			break;
			case "banana": log.info("hi banana");
			break;
			case "pinapple": log.info("hi pinapple");
			break;
			default: log.info("sorry wrong input");
			break;
		}

	}

}
