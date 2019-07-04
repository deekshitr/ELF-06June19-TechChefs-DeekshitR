package com.tyss.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "AGE")
	private int age;
	@Column(name = "Name")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SALARY")
	private long salary;
	@Column(name = "PHONE")
	private long phone;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "ACCOUNT_Number")
	private long account_no;
	@Column(name = "JOINING_DATE")
	private Date joining_date;
	@Column(name = "DEPT_ID")
	private int dept_ID;
	@Column(name = "MNGR_ID")
	private int manager_ID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
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

	public long getCcnt_no() {
		return account_no;
	}

	public void setCcnt_no(long account_no) {
		this.account_no = account_no;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public int getDept_ID() {
		return dept_ID;
	}

	public void setDept_ID(int dept_ID) {
		this.dept_ID = dept_ID;
	}

	public int getManager_ID() {
		return manager_ID;
	}

	public void setManager_ID(int manager_ID) {
		this.manager_ID = manager_ID;
	}

}// end of class
