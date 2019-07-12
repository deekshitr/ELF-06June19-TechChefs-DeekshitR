package com.techchefs.javaapp.eighthassignment;

/* USE CASE :
 * Employee is a bean class having Student data 
 * 
 */

//SOLUTION :
public class Employee {
	
	private String name ;
	private int empId ;
	private int salary;
	private String job;
	
	public Employee(String name, int empId, int salary, String job) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}	
	
}//end of class
