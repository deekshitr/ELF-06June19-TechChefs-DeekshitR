package com.techchefs.jdbc.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfo {
	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;

}
