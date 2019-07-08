package com.techchefs.designpatterns.builder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public final class EmployeeData {
	
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
