package com.techchefs.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecordsTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();

		EmployeeInfoBean bean = ses.get(EmployeeInfoBean.class,1);
		log.info("EmployeeInfo is :"+bean.getId());
		log.info("EmployeeInfo is :"+bean.getName());
		log.info("EmployeeInfo is :"+bean.getSalary());
		log.info("EmployeeInfo is :"+bean.getDesignation());
		log.info("EmployeeInfo is :"+bean.getEmail());
		
		Transaction transactions =	ses.beginTransaction();
		transactions.commit();
		ses.close(); 
	}

}
