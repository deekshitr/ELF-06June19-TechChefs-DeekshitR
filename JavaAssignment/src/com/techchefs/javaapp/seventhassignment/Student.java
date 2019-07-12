package com.techchefs.javaapp.seventhassignment;

/* USE CASE :
 * Student is a Bean class having Student data 
 * 
 */

//SOLUTION :
public class Student {
	
	private String name;
	private int id;
	private double percent;
	private String gender;
	
	public Student(String name, int id, double percent, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.percent = percent;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	

}//end of class
