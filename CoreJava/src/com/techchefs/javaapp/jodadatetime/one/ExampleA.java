package com.techchefs.javaapp.jodadatetime.one;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		
		LocalDate a = LocalDate.now();
		LocalDate dob = LocalDate.parse("1992-07-20");
		LocalDate indi = LocalDate.of(1947,8,15);
		LocalDate dyear = dob.plusYears(60);
		
		log.info("getDayOfMonth "+a.getDayOfMonth());
		log.info("getDayOfWeek "+a.getDayOfWeek());
		log.info("getDayOfYear "+a.getDayOfYear());
		log.info("getMonth "+a.getMonth());
		log.info("getYear "+a.getYear());
		log.info("isLeapYear "+a.isLeapYear());
		
		log.info("now "+a.now());
		log.info("withYear "+a.withYear(2020));
		log.info("withMonth "+a.withMonth(10));
		
		log.info("plusMonths "+a.plusMonths(10));
		log.info("plusWeeks "+a.plusWeeks(10));
		log.info("plusYears "+a.plusYears(10));
		log.info("toString "+a.toString());
		
		log.info("dob "+dob);
		
		log.info("a plus "+a.plus(365, ChronoUnit.MONTHS));
		
		log.info("diff between today and dob "+Period.between(a,dob));
		
		log.info("diff between today and indi "+Period.between(a,indi));
		
		log.info("days lifespan "+dob.plusYears(60));
		
		
	}

}
