package com.techchefs.hibernetapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {
		log.info("1st : "+getEmployeeData(1).toString());
		log.info("2nd : "+getEmployeeData(2).toString());
		log.info("3rd : "+getEmployeeData(6).toString());
		
	}

	private static NewEmployeeInfoBean getEmployeeData(int id) {
		//1.Load the config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernetapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2.Build the session factory
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//3.open session
		Session ses = sessionFactory.openSession();
		
		//4.Interact with db via session
		NewEmployeeInfoBean bean = ses.get(NewEmployeeInfoBean.class, 1);
		log.info("1st bean : "+bean);
		
		//5.close the session
		ses.close();
		return bean;
	}
}
