package com.tyss.hibernateapp.dto;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean {
	
	@Column(name="ISMARRIED")
	private boolean ismarried;  
	@Column(name="PAN")
	private String pan;  
	@Column(name="BLOOD_GROUP")
	private String blood_grp;
	@Column(name="ISCHALLENGED")
	private boolean isChallenged;
	@Column(name="EMERGENCY_CONTACT_NUMBER")
	private long emergency_contact_number;
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergency_contact_name;
	@Column(name="NATIONALITY")
	private String nationality;	
	@Column(name="RELIGION")
	private String religion;	
	@Column(name="FATHER_NM")
	private String father_name;	
	@Column(name="MOTHER_NM")
	private String mother_name;	
	@Column(name="SPOUSE_NM")
	private String spouse_NM ;  
	
	@Id
	@Column(name="ID")
	private int Id	;	
	@Column(name="PASSPORT")
	private long passport;	
	@Column(name="ADHAR")
	private long adhar;					  


}//end of class

