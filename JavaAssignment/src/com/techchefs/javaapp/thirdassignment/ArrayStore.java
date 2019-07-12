package com.techchefs.javaapp.thirdassignment;

import lombok.extern.java.Log;

@Log
public class ArrayStore {

	void store(Student[] s) {
		log.info("************ Student detail***********");

		for(int i=0 ; i<s.length ; i++) {
			log.info("Name is " + s[i].getName());
			log.info("Age is " + s[i].getAge());
		}
		

	}

}
