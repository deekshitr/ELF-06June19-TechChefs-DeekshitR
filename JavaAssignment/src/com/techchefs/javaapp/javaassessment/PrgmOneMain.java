package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * PrgmOneMain is a main class of Animal class
 * 
 */

//SOLUTION :
public class PrgmOneMain {

	public static void main(String[] args) {
		
		PassingObjectPrgmOne objectPrgmOne = new PassingObjectPrgmOne();
		
		DogPrgmOne dogone = new DogPrgmOne();
		CowPrgmOne cowOne = new CowPrgmOne();
		
		objectPrgmOne.recieve(dogone);
		
		
	}//end of main
}//end of class
