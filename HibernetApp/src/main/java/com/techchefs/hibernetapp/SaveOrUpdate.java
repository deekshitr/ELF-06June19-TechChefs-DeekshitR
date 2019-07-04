package com.techchefs.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

public class SaveOrUpdate {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		 Session session= sessionfactory.openSession();
		 
		 EmployeeInfoBean bean =session.get(EmployeeInfoBean.class,1);
		 
		 Transaction transaction=session.beginTransaction();
		    
		bean.setAge(38);
		    
		session.saveOrUpdate(bean);

		transaction.commit();
		session.close();
	}

}
