package com.techchefs.hibernateapprelationalmapping.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class EmployeeExperienceInfoPKBean implements Serializable {
	
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="company_name")
	private String companyName;
}
