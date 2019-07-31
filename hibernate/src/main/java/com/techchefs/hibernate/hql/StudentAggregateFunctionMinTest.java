package com.techchefs.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernate.dto.StudentBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentAggregateFunctionMinTest {
	public static void main(String[] args) {
		
Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			
			String hqlQuery = "select min(totalMarks) from StudentBean";
			
			Query query = session.createQuery(hqlQuery);
			
			Double leastMarks =  (Double) query.getSingleResult();
			
			log.info("student leastMarks :" + leastMarks);
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}
}
