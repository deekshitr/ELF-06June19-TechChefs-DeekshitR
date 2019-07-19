package com.techchefs.hibernetapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernetapp.onetoone.EmployeeOtherInfoBean;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;

	}
	
	public static SessionFactory buildSessionFactory2() {
		if (sessionFactory == null) {
			return new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(EmployeeInfoBean.class)
					.addAnnotatedClass(EmployeeOtherInfoBean.class)
					.buildSessionFactory();
		} else {
			return sessionFactory;
		}
		
	}
	
	public static Session getSession() {
		return buildSessionFactory2().openSession();
	}
}
