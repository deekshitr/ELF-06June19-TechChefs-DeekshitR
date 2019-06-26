package com.techchefs.javaapp.javaenum.one;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		log.info("male : "+Gender.MALE);
		log.info("male : "+Gender.FEMALE.ordinal());
		log.info("male : "+Gender.OTHERS.ordinal());
		
		Gender t = Gender.MALE;
		
		switch (t) {
		case MALE: log.info("I am MALE");
			
		break;
		case FEMALE: log.info("I am FEMALE");
		
		break;
		case OTHERS: log.info("I am OTHERS");
		
		break;

		default:
			break;
		}

	}

}
