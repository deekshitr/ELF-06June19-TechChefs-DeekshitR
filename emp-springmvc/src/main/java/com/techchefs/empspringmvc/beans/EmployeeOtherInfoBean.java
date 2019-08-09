package com.techchefs.empspringmvc.beans;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfoBean implements Serializable {
	
	@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;	
	@Column(name="pan")
	private String pan;  
	@Column(name="isMarried")
	private Boolean isMarried;  
	@Column(name="blood_grp")
	private String bloodGrp;
	@Column(name="isChallenged")
	private Boolean isChallenged;
	@Column(name="emergency_contact_number")
	private Long emergencyContactNumber;
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
	private Long passport;	
	@Column(name="aadhardhar")
	private Long adhar;					  


}//end of class

