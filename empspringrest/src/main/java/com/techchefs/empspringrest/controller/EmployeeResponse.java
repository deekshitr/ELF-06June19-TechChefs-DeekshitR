package com.techchefs.empspringrest.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.techchefs.empspringrest.beans.EmployeeInfoBean;

@JsonRootName("employee-response")
public class EmployeeResponse {
	
	private int statusCode;
	
	private String message;
	
	private String description;
	
	private List<EmployeeInfoBean> empInfoBeans;
	
	public int getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public List<EmployeeInfoBean> getEmpInfoBeans() {
		return empInfoBeans;
	}

	public void setEmpInfoBeans(List<EmployeeInfoBean> empInfoBeans) {
		this.empInfoBeans = empInfoBeans;
	}

}
