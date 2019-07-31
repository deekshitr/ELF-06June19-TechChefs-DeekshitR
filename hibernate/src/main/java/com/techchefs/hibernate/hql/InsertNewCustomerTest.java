package com.techchefs.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertNewCustomerTest {
	
	public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			
			String hqlQuery = "insert into NewCustomerBean(id, firstName, lastName, city) "
					+ "select id, firstName, lastName, city from CustomerBean where id=1";
			
			Query query = session.createQuery(hqlQuery);
			
			transaction = session.beginTransaction();
			int isInsert = query.executeUpdate();
			transaction.commit();
			log.info("isinsert "+isInsert);
			
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
	}
}
