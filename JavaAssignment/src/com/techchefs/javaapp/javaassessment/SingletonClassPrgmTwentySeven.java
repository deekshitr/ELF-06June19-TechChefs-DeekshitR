package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;
/* USE CASE :
 * SingletonClassPrgmTwentySeven is a singleton class 
 *have one method getSingle()
 * 
 */

//SOLUTION :
@Log
public class SingletonClassPrgmTwentySeven {
	
	private final int id;
	private final String name;
	private final String gender;
	private final double percent;
	
	private SingletonClassPrgmTwentySeven(int id, String name, String gender, double percent) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.percent = percent;
	}
	
	public static void getSingle()	{
		log.info("Singleton method");
	}
	

}//end of class
