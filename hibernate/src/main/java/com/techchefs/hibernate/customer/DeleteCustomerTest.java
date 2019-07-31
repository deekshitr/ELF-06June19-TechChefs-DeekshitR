package com.techchefs.hibernate.customer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.CustomerBean;
import com.techchefs.hibernate.util.HibernateUtil;

public class DeleteCustomerTest {
	public static void main(String[] args) {
		
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.openSession();) {
			CustomerBean customerBean = session.get(CustomerBean.class, 2);
			transaction = session.beginTransaction();
			session.delete(customerBean);
			transaction.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
	}
}
