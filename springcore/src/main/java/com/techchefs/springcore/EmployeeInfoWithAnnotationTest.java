package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springcore.beans.DepartmentInfoBean;
import com.techchefs.springcore.beans.EmployeeInfoBeanWithAnnotation;
import com.techchefs.springcore.config.EmployeeInfoConfig;
import com.techchefs.springcore.config.ImportAllConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeInfoWithAnnotationTest {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportAllConfig.class);
		
		EmployeeInfoBeanWithAnnotation employeeInfoBeanWithAnnotation = applicationContext.getBean(EmployeeInfoBeanWithAnnotation.class);
		
		log.info("emp id : "+employeeInfoBeanWithAnnotation.getId());
		log.info("emp Name : "+employeeInfoBeanWithAnnotation.getName());
		
		DepartmentInfoBean departmentInfoBean = employeeInfoBeanWithAnnotation.getDepartmentBean();
		
		log.info("Dept id : "+departmentInfoBean.getDeptId());
		log.info("Dept Name : "+departmentInfoBean.getDeptName());
		
	}
}
