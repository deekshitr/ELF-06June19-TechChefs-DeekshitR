package com.techchefs.designpatterns.builder;

import java.util.Date;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public final class EmployeeData3 {
	
	private int id;      
	private String name;       
	private int age;   
	private String gender;     
	private int salary; 
	private long phone;     
	private Date joiningDate; 
	private long accNum;
	private String email;   
	private String designation; 
	private Date dob; 
	private int departmentId; 
	private int managerId; 
}
