package com.techchefs.empspringmvc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;

import lombok.Data;

public class HibernateUtil {

	/*
	 * private static SessionFactory sessionFactory;
	 * 
	 * private HibernateUtil() {};
	 * 
	 * private static SessionFactory buildSessionFactory() { return new
	 * Configuration() .configure() .addAnnotatedClass(EmployeeInfoBean.class)
	 * .buildSessionFactory(); }
	 * 
	 * public static SessionFactory getSessionFactory() { if (sessionFactory ==
	 * null) sessionFactory = buildSessionFactory(); return sessionFactory;
	 * 
	 * }
	 * 
	 * public static Session openSession() { return
	 * getSessionFactory().openSession(); }
	 */
	
	/*
	 * @Autowired private SessionFactory sessionFactory;
	 * 
	 * public Session openSession() { return sessionFactory.openSession(); }
	 */
}
