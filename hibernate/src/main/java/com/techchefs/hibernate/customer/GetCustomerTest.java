package com.techchefs.hibernate.customer;

import org.hibernate.Session;

import com.techchefs.hibernate.dto.CustomerBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetCustomerTest {
	
	public static void main(String[] args) {
				
		try (Session session = HibernateUtil.openSession();) {
			CustomerBean customerBean = session.get(CustomerBean.class, 1);
			log.info("Customer Id : "+customerBean.getId());
			log.info("Customer firstName : "+customerBean.getFirstName());
			log.info("Customer lastName : "+customerBean.getLastName());
			log.info("Customer contactNum : "+customerBean.getContactNum());
			log.info("Customer address : "+customerBean.getAddress());
			log.info("Customer city : "+customerBean.getCity());
			log.info("Customer state : "+customerBean.getState());
			log.info("Customer country : "+customerBean.getCountry());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
