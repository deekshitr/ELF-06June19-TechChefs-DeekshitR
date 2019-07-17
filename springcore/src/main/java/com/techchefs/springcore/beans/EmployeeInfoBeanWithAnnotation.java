package com.techchefs.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeInfoBeanWithAnnotation {
	private int id;       
	private String name;  
	
	@Autowired
	@Qualifier("hr")
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
	public DepartmentInfoBean getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(DepartmentInfoBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
}
