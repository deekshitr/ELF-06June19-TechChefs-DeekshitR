package com.techchefs.empspringrest.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

//@Data
@XmlAccessorType(XmlAccessType.FIELD)
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

	public EmployeeEducationInfoPKBean getEmpEducationInfoPKBean() {
		return empEducationInfoPKBean;
	}

	public void setEmpEducationInfoPKBean(EmployeeEducationInfoPKBean empEducationInfoPKBean) {
		this.empEducationInfoPKBean = empEducationInfoPKBean;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getYop() {
		return yop;
	}

	public void setYop(Date yop) {
		this.yop = yop;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
