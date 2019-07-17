 package com.techchefs.springboot.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

//@Data
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="department_info")
public class DepartmentInfoBean implements Serializable{
	
	@Id
	@Column(name="dept_id")
	private Integer departmentId;
	
	@Column(name="dept_name")
	private String departmentName;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
