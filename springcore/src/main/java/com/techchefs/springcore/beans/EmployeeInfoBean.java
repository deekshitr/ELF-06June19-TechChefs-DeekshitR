package com.techchefs.springcore.beans;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;

@Log
public class EmployeeInfoBean implements InitializingBean, DisposableBean {
	private int id;       
	private String name;       
//	private int age;            
//	private String gender;         
//	private double salary;  
	private DepartmentInfoBean departmentBean;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	/*
	 * public int getAge() { return age; } public void setAge(int age) { this.age =
	 * age; } public String getGender() { return gender; } public void
	 * setGender(String gender) { this.gender = gender; } public double getSalary()
	 * { return salary; } public void setSalary(double salary) { this.salary =
	 * salary; }
	 */
	
	public DepartmentInfoBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentInfoBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("Initializing bean...");
	}  
	@Override
	public void destroy() throws Exception {
		log.info("Destroy bean");
	}      
	
}
