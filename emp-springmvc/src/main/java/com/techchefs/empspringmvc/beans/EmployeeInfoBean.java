package com.techchefs.empspringmvc.beans;

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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empAddressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empEducationInfoPKBean.infoBean")
	private List<EmployeeEducationInfoBean> educationInfoBean;
	
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
	@Column(name="joining_date")
	private Date joiningDate; 
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

}
