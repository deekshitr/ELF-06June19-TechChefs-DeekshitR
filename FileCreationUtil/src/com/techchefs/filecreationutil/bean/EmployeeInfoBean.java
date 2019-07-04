package com.techchefs.filecreationutil.bean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {
	
	private int id;
	private String name;
	private String email;
	private int phone;
	private Date joiningDate;
	private double salary;
	
	
}
