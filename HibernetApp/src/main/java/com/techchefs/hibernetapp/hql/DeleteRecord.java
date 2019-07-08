package com.techchefs.hibernetapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = null;
		try {
			String hql = "delete from EmployeeInfoBean where id=7";
			Query query = session.createQuery(hql);
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Delete : " + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}

	}
}
