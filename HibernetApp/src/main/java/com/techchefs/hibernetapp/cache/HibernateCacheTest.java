package com.techchefs.hibernetapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		
		//1.Load the config file
		Configuration config = new Configuration();
		config.configure("com/techchefs/hibernetapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2.Build the session factory
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//3.open session
		Session ses = sessionFactory.openSession();
		
		//4.Interact with db via session
		NewEmployeeInfoBean bean1 = ses.get(NewEmployeeInfoBean.class, 1);
		log.info("1st bean : "+bean1);
		
		NewEmployeeInfoBean bean2 = ses.get(NewEmployeeInfoBean.class, 1);
		log.info("2nd bean : "+bean2);
		
		NewEmployeeInfoBean bean3 = ses.get(NewEmployeeInfoBean.class, 1);
		log.info("3rd bean : "+bean3);
		
		//5.close the session
		ses.close();
	}
}
