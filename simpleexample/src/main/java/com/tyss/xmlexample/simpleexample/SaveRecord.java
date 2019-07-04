package com.tyss.xmlexample.simpleexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tyss.hibernateapp.dto.DeptBean;

public class SaveRecord {

	 public static void main(String[] args) {
		
		 Configuration cgf=new Configuration();
		 cgf.configure();
		 
		 SessionFactory factory=cgf.buildSessionFactory();
		 Session session=factory.openSession();
		 
		 DeptBean db=new DeptBean();
		 db.setDeptno(20);
		 db.setDeptname("Development");
		 db.setLocation("Mumbai");
		 
		 Transaction transaction=session.beginTransaction();
		 session.save(db);
		 transaction.commit();
		 session.close();
	}
}
