package com.techchefs.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentAggregateFunctionAvgTest {

	public static void main(String[] args) {
Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			
			String hqlQuery = "select avg(totalMarks) from StudentBean";
			
			Query query = session.createQuery(hqlQuery);
			
			Double avgMarks =  (Double) query.getSingleResult();
			
			log.info("student Avg Marks :" + avgMarks);
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
