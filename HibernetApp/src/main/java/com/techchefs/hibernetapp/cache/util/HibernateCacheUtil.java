package com.techchefs.hibernetapp.cache.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.cache.NewEmployeeInfoBean;

public class HibernateCacheUtil {
	
	private static SessionFactory factory = null;
	
	private HibernateCacheUtil() {}
	
	private static SessionFactory buildSessionFactory() {
		
		if (factory == null) {
			factory = new Configuration()
						.configure("com/techchefs/hibernetapp/cache/hibernate.cache.cfg.xml")
						.addAnnotatedClass(NewEmployeeInfoBean.class)
						.buildSessionFactory();		
		}
		return factory;
	}
	
	public static Session openSession() {
		return buildSessionFactory().openSession();
	}
}
