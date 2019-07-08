package com.techchefs.hibernetapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DynamicUpdate {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = null;
		try {
			//String hql = "update from EmployeeInfoBean set name=:ename where id=:eid";
			
			String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where id="+args[1];
			
			Query query = session.createQuery(hql);
			/*
			 * query.setParameter("ename", args[0]);
			 * query.setParameter("eid",Integer.parseInt(args[1]));
			 */
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Update : " + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}

	}

}
