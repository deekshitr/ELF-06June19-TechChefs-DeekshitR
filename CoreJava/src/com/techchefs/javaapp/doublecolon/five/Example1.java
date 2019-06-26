package com.techchefs.javaapp.doublecolon.five;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		MyPerson mp = Person::new;
		Person p1 = mp.getPerson("Nikitha", 5.6,'F');
		log.info("Person p1: "+p1);
		
		Person p2 = mp.getPerson("Umesh", 5.8,'M');
		log.info("Person p1: "+p2);
		
	}

}
