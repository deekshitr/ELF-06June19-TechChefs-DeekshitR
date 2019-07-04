package com.techchefs.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class DeleteRecordsTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session ses = factory.openSession();

		EmployeeInfoBean bean = ses.get(EmployeeInfoBean.class,8);

		Transaction transactions =	ses.beginTransaction();
		ses.delete(bean);
		transactions.commit();
		ses.close(); 
		log.info("Deleted Successfully");

	}

}
