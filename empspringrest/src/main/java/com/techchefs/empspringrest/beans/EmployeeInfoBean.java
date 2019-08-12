package com.techchefs.empspringrest.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import lombok.Data;

@XmlRootElement(name="employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
//@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	@XmlElement(name="other-info")
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfoBean;
	
	@XmlElement(name="address-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empAddressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@XmlElement(name="education-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empEducationInfoPKBean.infoBean")
	private List<EmployeeEducationInfoBean> educationInfoBean;
	
	@XmlElement(name="experience-info")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empExperienceInfoPKBean.infoBean")
	private List<EmployeeExperienceInfoBean> expirenceInfoBean;
	
//	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBean")
//	private List<TrainingInfoBean> trainingInfoBeans;
	
	@Id
	@Column(name="id")
	private Integer id;      
	@Column(name="name")
	private String name;  
	@Column(name="password")
	private String password;  
	@Column(name="age")
	private Integer age;   
	@Column(name="gender")
	private String gender;     
	@Column(name="salary")
	private Double salary; 
	@Column(name="phone")
	private Long phone;    
	
	@XmlElement(name="joining-date")
	@Column(name="joining_date")
	private Date joiningDate; 
	
	@XmlElement(name="acc-num")
	@Column(name="acc_num")
	private Long accNum;
	@Column(name="email")
	private String email;   
	@Column(name="designation")
	private String designation; 
	@Column(name="dob")
	private Date dob; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id", referencedColumnName = "dept_id")
	private DepartmentInfoBean deptInfoBean; 	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id", referencedColumnName = "id")
	private EmployeeInfoBean managerId;

	public EmployeeOtherInfoBean getOtherInfoBean() {
		return otherInfoBean;
	}

	public void setOtherInfoBean(EmployeeOtherInfoBean otherInfoBean) {
		this.otherInfoBean = otherInfoBean;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBean() {
		return addressInfoBean;
	}

	public void setAddressInfoBean(List<EmployeeAddressInfoBean> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}

	public List<EmployeeEducationInfoBean> getEducationInfoBean() {
		return educationInfoBean;
	}

	public void setEducationInfoBean(List<EmployeeEducationInfoBean> educationInfoBean) {
		this.educationInfoBean = educationInfoBean;
	}

	public List<EmployeeExperienceInfoBean> getExpirenceInfoBean() {
		return expirenceInfoBean;
	}

	public void setExpirenceInfoBean(List<EmployeeExperienceInfoBean> expirenceInfoBean) {
		this.expirenceInfoBean = expirenceInfoBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Long getAccNum() {
		return accNum;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentInfoBean getDeptInfoBean() {
		return deptInfoBean;
	}

	public void setDeptInfoBean(DepartmentInfoBean deptInfoBean) {
		this.deptInfoBean = deptInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}
	
}
