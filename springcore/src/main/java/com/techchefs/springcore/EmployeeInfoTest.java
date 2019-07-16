package com.techchefs.springcore;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class EmployeeInfoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmployeeInfoBean.xml");
		EmployeeInfoBean empInfo1 = (EmployeeInfoBean) applicationContext.getBean("empInfoBean");
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * log.info("Enter EId : "); empInfo1.setId(sc.nextInt()); sc.nextLine();
		 * log.info("Enter EName : "); empInfo1.setName(sc.nextLine());
		 * 
		 * log.info("Enter EGender : "); empInfo1.setGender(sc.nextLine());
		 * 
		 * log.info("Enter EAge : "); empInfo1.setAge(sc.nextInt());
		 * 
		 * log.info("Enter ESalary : "); empInfo1.setSalary(sc.nextInt());
		 * 
		 * EmployeeInfoBean empInfo2 = (EmployeeInfoBean)
		 * applicationContext.getBean("empInfoBean");
		 * 
		 * log.info("Enter EId : "); empInfo2.setId(sc.nextInt()); sc.nextLine();
		 * log.info("Enter EName : "); empInfo2.setName(sc.nextLine());
		 * 
		 * log.info("Enter EGender : "); empInfo2.setGender(sc.nextLine());
		 * 
		 * log.info("Enter EAge : "); empInfo2.setAge(sc.nextInt());
		 * 
		 * log.info("Enter ESalary : "); empInfo2.setSalary(sc.nextInt());
		 * 
		 * log.info("Id : "+empInfo1.getId()); log.info("Name : "+empInfo1.getName());
		 * log.info("Gender : "+empInfo1.getGender());
		 * log.info("Age : "+empInfo1.getAge());
		 * log.info("Salary : "+empInfo1.getSalary());
		 * 
		 * log.info("Id : "+empInfo2.getId()); log.info("Name : "+empInfo2.getName());
		 * log.info("Gender : "+empInfo2.getGender());
		 * log.info("Age : "+empInfo2.getAge());
		 * log.info("Salary : "+empInfo2.getSalary());
		 * 
		 * ((AbstractApplicationContext)applicationContext).close();
		 */
		
		log.info("Emp Id : "+empInfo1.getId());
		log.info("Emp Name : "+empInfo1.getName());
		
		log.info("Dept Id : "+empInfo1.getDepartmentBean().getDeptId());
		log.info("Dept Name : "+empInfo1.getDepartmentBean().getDeptName());
	}

}
