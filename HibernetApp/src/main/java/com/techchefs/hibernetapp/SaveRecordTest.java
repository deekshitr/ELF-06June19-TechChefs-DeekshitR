package com.techchefs.hibernetapp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;


public class SaveRecordTest {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		/*
		 * cfg.addAnnotatedClass(EmployeeInfoBean.class);
		 */		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date joiningDate =  dateFormat.parse("2019-02-17");
		Date dob =  dateFormat.parse("1995-04-17");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(2);
		empInfo.setName("Kalpana");
		empInfo.setAge(38);
		empInfo.setGender("F");
		empInfo.setSalary(62999);
		empInfo.setPhone(9922244227L);
		empInfo.setJoiningDate(joiningDate);
		empInfo.setAccNum(2299115599L);
		empInfo.setEmail("b@gmail.com");
		empInfo.setDesignation("Software Endineer");
		empInfo.setDob(dob);
		empInfo.setDeptId(2);
		empInfo.setManagerId(1);
		
		Transaction transaction = session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
		
	}
}
