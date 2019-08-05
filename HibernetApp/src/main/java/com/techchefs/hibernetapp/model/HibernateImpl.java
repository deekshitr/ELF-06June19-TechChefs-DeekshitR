package com.techchefs.hibernetapp.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernetapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernetapp.onetoone.EmployeeOtherInfoBean;

public class HibernateImpl {
	
	private Configuration config = new Configuration();
	
	private SessionFactory factory = config
			.configure()
			.buildSessionFactory();
	
	public void craeteEmployee(EmployeeInfoBean infoBean,
		EmployeeOtherInfoBean otherInfoBean) {
	
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(infoBean);
			session.save(otherInfoBean);
			transaction.commit();
			session.close();
}
}
