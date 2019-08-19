package com.techchefs.springboot.beans;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

//@Data
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfoBean implements Serializable {
	
	@Id
	@Column(name = "other_info_id")
	@GeneratedValue
	private Integer otherInfoId;
	//@XmlTransient
	@JsonIgnore
	//@Id
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName = "id", unique = true, nullable = false)
	private EmployeeInfoBean infoBean;	

	public Integer getOtherInfoId() {
		return otherInfoId;
	}
	public void setOtherInfoId(Integer otherInfoId) {
		this.otherInfoId = otherInfoId;
	}
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
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Boolean getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public Boolean getIsChallenged() {
		return isChallenged;
	}
	public void setIsChallenged(Boolean isChallenged) {
		this.isChallenged = isChallenged;
	}
	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public Long getPassport() {
		return passport;
	}
	public void setPassport(Long passport) {
		this.passport = passport;
	}
	public Long getAdhar() {
		return adhar;
	}
	public void setAdhar(Long adhar) {
		this.adhar = adhar;
	}					  

	
}//end of class

