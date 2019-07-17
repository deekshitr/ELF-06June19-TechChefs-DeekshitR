package com.techchefs.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.techchefs.springcore.beans.DepartmentInfoBean;
import com.techchefs.springcore.beans.EmployeeInfoBeanWithAnnotation;

@Configuration
//@Import(DepatmentInfoConfig.class)
public class EmployeeInfoConfig {
	
	@Bean
	public EmployeeInfoBeanWithAnnotation getEmployeeBean() {
		EmployeeInfoBeanWithAnnotation employeeInfoBean = new EmployeeInfoBeanWithAnnotation();
		employeeInfoBean.setId(101);
		employeeInfoBean.setName("John");
		
		return employeeInfoBean;
	}
	
	/*
	 * @Bean public DepartmentInfoBean getDepartmentInfoBean() { DepartmentInfoBean
	 * departmentInfoBean = new DepartmentInfoBean();
	 * departmentInfoBean.setDeptId(101); departmentInfoBean.setDeptName("IT");
	 * 
	 * return departmentInfoBean; }
	 */
}
