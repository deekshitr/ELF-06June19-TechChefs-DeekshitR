package com.techchefs.javaapp.jodadatetime.one;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class ExampleB {

	public static void main(String[] args) {
		
		ZoneId z = ZoneId.systemDefault();
		log.info("z: "+z);
		
		ZoneId t = ZoneId.of("Australia/Sydney");
		
		ZonedDateTime ze = ZonedDateTime.now(t);
		log.info(""+ze.toLocalDateTime());
	}

}