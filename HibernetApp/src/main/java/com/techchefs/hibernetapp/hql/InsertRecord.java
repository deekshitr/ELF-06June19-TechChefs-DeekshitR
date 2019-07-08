package com.techchefs.hibernetapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = null;
		try {
			String hql = "insert into EmployeeNewInfoBean(id,name,age) select id,name,age from EmployeeInfoBean where id=1";
			Query query = session.createQuery(hql);
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Insert : " + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
}
