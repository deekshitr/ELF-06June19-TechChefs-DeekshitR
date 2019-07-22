package com.techchefs.warehouse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.warehouse.beans.ItemBean;
import com.techchefs.warehouse.config.HibernateConfig;

public class WareHouseInsertTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = applicationContext.getBean(SessionFactory.class);
		Transaction transaction = null;
				
		ItemBean itemBean = new ItemBean();
		itemBean.setItemId(1);
		itemBean.setItemName("Phones");
		itemBean.setItemdescription("Stores all types of phones");
		itemBean.setCost(234532);
		itemBean.setItemQuantity(100);
		
		try(Session session = factory.openSession();) {
			session.saveOrUpdate(itemBean);
			transaction.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
		
	}

}
