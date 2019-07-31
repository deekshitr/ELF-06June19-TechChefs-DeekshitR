package com.techchefs.hibernate.customer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.CustomerBean;
import com.techchefs.hibernate.util.HibernateUtil;

public class UpdateCustomerTest {
	public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			CustomerBean customerBean = session.get(CustomerBean.class, 1);
			customerBean.setContactNum(1111111111L);
			
			transaction = session.beginTransaction();
			session.update(customerBean);
			transaction.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
	}
}
