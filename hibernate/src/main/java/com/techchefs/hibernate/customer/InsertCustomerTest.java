package com.techchefs.hibernate.customer;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.CustomerBean;
import com.techchefs.hibernate.util.HibernateUtil;

public class InsertCustomerTest {
	public static void main(String[] args) {
		
		Transaction transaction = null;
		
		CustomerBean customerBean = new CustomerBean();
		customerBean.setId(2);
		customerBean.setFirstName("Tarun");
		customerBean.setLastName("Nandan");
		customerBean.setContactNum(9999999999L);
		customerBean.setAddress("erfrgg");
		customerBean.setCity("Mangalore");
		customerBean.setState("Karnataka");
		customerBean.setCountry("India");
		
		try (Session session = HibernateUtil.openSession();) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(customerBean);
			transaction.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
				 
	}
}
