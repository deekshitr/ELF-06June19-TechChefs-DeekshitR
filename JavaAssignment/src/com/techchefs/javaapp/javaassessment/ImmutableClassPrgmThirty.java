package com.techchefs.javaapp.javaassessment;

import java.io.Serializable;

/* USE CASE :
 * ImmutableClassPrgmThirty is an immutable class 
 * 
 */

//SOLUTION :
public class ImmutableClassPrgmThirty implements Serializable{
	
	private final int id;
	private final String name;
	private final String gender;
	private final double percent;
	
	public ImmutableClassPrgmThirty(int id, String name, String gender, double percent) {
              		this.id = id;
		this.name = name;
		this.gender = gender;
		this.percent = percent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getPercent() {
		return percent;
	}
	
	

}
