package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

@Log
public class ArrayListTestPrgmFive {

	public static void main(String[] args) {
		AnimalPrgmOne animal = new AnimalPrgmOne();
		
		AnimalPrgmOne animal1 = new CowPrgmFive();
		AnimalPrgmOne animal2 = new CowPrgmFive();
		AnimalPrgmOne animal3 = new CowPrgmFive();
		AnimalPrgmOne animal4 = new LionPrgmFive();
		AnimalPrgmOne animal5 = new DogPrgmFive();
				
		
		log.info("cow objects are " + CowPrgmFive.cowCount);
		log.info("dog objects are " + DogPrgmFive.dogCount);
		log.info("lion objects are " + LionPrgmFive.lionCount);
	}
	
	
	

}
