package com.techchefs.hibernateapprelationalmapping.dto;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfoBean implements Serializable {
	
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;	
	@Column(name="pan")
	private String pan;  
	@Column(name="isMarried")
	private boolean isMarried;  
	@Column(name="blood_grp")
	private String bloodGrp;
	@Column(name="isChallenged")
	private boolean isChallenged;
	@Column(name="emergency_contact_number")
	private long emergencyContactNumber;
	@Column(name="emergency_contact_name")
	private String emergencyContactName;
	@Column(name="nationality")
	private String nationality;	
	@Column(name="religion")
	private String religion;	
	@Column(name="father_name")
	private String fatherName;	
	@Column(name="mother_name")
	private String motherName;	
	@Column(name="spouse_name")
	private String spouseName ;  
	@Column(name="passport")
	private long passport;	
	@Column(name="aadhardhar")
	private long adhar;					  


}//end of class

