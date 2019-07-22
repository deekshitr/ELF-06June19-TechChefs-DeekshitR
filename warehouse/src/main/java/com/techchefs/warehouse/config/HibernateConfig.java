package com.techchefs.warehouse.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import com.techchefs.warehouse.beans.ItemBean;

@org.springframework.context.annotation.Configuration
public class HibernateConfig {
	
	@Bean
	public SessionFactory getSessionFactory() {
		
		return new Configuration()
				.configure()
				.addAnnotatedClass(ItemBean.class)
				.buildSessionFactory();
	}
}
