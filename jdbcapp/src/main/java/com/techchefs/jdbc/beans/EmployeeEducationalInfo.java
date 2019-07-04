package com.techchefs.jdbc.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationalInfo {
	private int id;
	private String educationType;
	private String collegeName;
	private String university;
	private Date yop;
	private double percentage;
	private String location;
	private String degreeType;
	private String branch;

}
