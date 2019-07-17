package com.techchefs.springcore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.techchefs.springcore.beans.DepartmentInfoBean;

@Configuration
public class DepartmentInfoConfig {
	
	@Bean(name="it")
//	@Primary
	public DepartmentInfoBean getDepartmentIT() {
		DepartmentInfoBean departmentInfoBean = new DepartmentInfoBean();
		departmentInfoBean.setDeptId(101);
		departmentInfoBean.setDeptName("IT");
		
		return departmentInfoBean;
	}
	
	@Bean(name="hr")
	public DepartmentInfoBean getDepartmentHR() {
		DepartmentInfoBean departmentInfoBean = new DepartmentInfoBean();
		departmentInfoBean.setDeptId(102);
		departmentInfoBean.setDeptName("HR");
		
		return departmentInfoBean;
	}
	
	@Bean(name="testing")
	public DepartmentInfoBean getDepartmentTesting() {
		DepartmentInfoBean departmentInfoBean = new DepartmentInfoBean();
		departmentInfoBean.setDeptId(103);
		departmentInfoBean.setDeptName("Testing");
		
		return departmentInfoBean;
	}
}
