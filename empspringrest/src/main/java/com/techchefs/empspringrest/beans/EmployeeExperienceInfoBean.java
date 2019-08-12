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
@Table(name="employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeExperienceInfoPKBean empExperienceInfoPKBean;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="joining_date")
	private Date joiningDate;
	
	@Column(name="leaving_date")
	private Date leavingDate;

	public EmployeeExperienceInfoPKBean getEmpExperienceInfoPKBean() {
		return empExperienceInfoPKBean;
	}

	public void setEmpExperienceInfoPKBean(EmployeeExperienceInfoPKBean empExperienceInfoPKBean) {
		this.empExperienceInfoPKBean = empExperienceInfoPKBean;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	
}
