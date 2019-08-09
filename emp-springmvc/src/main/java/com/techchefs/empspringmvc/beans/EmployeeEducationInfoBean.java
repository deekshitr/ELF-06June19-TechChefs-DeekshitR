package com.techchefs.empspringmvc.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_educational_info")
public class EmployeeEducationInfoBean implements Serializable {
	
	@EmbeddedId
	private EmployeeEducationInfoPKBean empEducationInfoPKBean;
	
	@Column(name="college_name")
	private String collegeName;
	
	@Column(name="university")
	private String university;
	
	@Column(name="yop")
	private Date yop;
	
	@Column(name="percentage")
	private Double percentage;
	
	@Column(name="location")
	private String location;
	
	@Column(name="degree_type")
	private String degreeType;
	
	@Column(name="branch")
	private String branch;
	
}
