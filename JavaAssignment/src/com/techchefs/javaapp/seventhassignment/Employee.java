package com.techchefs.javaapp.seventhassignment;

public class Employee {
	
	private String name ;
	private int empId ;
	private int exper;
	private String job;
		
	public Employee(String name, int empId, int exper, String job) {
		this.name = name;
		this.empId = empId;
		this.exper = exper;
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

	public int getExper() {
		return exper;
	}

	public void setExper(int exper) {
		this.exper = exper;
	}

	public String getJob() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
