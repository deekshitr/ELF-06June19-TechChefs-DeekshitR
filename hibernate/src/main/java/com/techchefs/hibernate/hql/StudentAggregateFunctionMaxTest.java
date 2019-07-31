package com.techchefs.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentAggregateFunctionMaxTest {

	public static void main(String[] args) {
Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			
			String hqlQuery = "select max(totalMarks) from StudentBean";
			
			Query query = session.createQuery(hqlQuery);
			
			Double maxMarks =  (Double) query.getSingleResult();
			
			log.info("student Max Marks :" + maxMarks);
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
