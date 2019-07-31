package com.techchefs.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;

public class UpdateRecordTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session ses =factory.openSession();

		EmployeeInfoBean bean = ses.get(EmployeeInfoBean.class, 1);
		bean.setAge(30);
		Transaction transaction =	ses.beginTransaction();
		ses.update(bean);
		transaction.commit();
		ses.close();

	}

}
