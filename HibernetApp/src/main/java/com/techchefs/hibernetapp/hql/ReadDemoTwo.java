package com.techchefs.hibernetapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemoTwo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		session.close();
		for (String empName: ename) {
			log.info("Name ------> " +empName);
			
		}
		
	}
}
