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
		Date joiningDate =  dateFormat.parse("2018-02-17");
		Date dob =  dateFormat.parse("1991-04-17");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(8);
		empInfo.setName("Kalpana");
		empInfo.setAge(28);
		empInfo.setGender("F");
		empInfo.setSalary(278999);
		empInfo.setPhone(9988224422L);
		empInfo.setJoiningDate(joiningDate);
		empInfo.setAccNum(2299115599L);
		empInfo.setEmail("h@gmail.com");
		empInfo.setDesignation("Tester");
		empInfo.setDob(dob);
		empInfo.setDeptId(1);
		empInfo.setManagerId(5);
		
		Transaction transaction = session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
		
	}
}
