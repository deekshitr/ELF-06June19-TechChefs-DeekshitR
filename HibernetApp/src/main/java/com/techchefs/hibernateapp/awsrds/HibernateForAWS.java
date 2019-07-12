package com.techchefs.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import lombok.extern.java.Log;

@Log
public class HibernateForAWS {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/techchefs/hibernateapp/awsrds/hibernate.aws.cfg.xml");
		cfg.addAnnotatedClass(NewEmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		NewEmployeeInfoBean bean = session.get(NewEmployeeInfoBean.class,8);
		log.info("bean : "+bean.toString());
		session.close();
	}
}
