package com.techchefs.empspringmvc.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class EmployeeEducationInfoPKBean implements Serializable{
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="education_type")
	private String educationType;
}
