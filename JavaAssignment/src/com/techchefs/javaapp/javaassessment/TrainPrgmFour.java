package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

@Log
public class TrainPrgmFour {

	private String name;
	private int id;

	public TrainPrgmFour() {
		name = "Rajhdhani";
		id = 23001;
	}

	public void searchByName() {
		log.info("Searching the train by name :" + name);

	}

	public void searchByID() {
		log.info("Searching the train by ID :" + id);

	}

}
