package com.techchefs.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernate.dto.CustomerBean;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory; 
	
	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		return new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(CustomerBean.class)
				.buildSessionFactory();
		} else {
			return sessionFactory;
		}
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
