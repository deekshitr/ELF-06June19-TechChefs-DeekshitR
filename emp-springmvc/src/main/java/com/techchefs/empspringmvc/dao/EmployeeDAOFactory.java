package com.techchefs.empspringmvc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	
	/*
	 * private static String dbInteractionType = "hibernate";
	 * 
	 * 
	 * private EmployeeDAOFactory() {
	 * 
	 * }
	 * 
	 * 
	 * public static EmployeeDAO getInstance(String dbInteractionType) {
	 * 
	 * EmployeeDAO dao = null;
	 * 
	 * if (dbInteractionType.equals("jdbc")) { dao = new EmployeeDAOJDBCImpl(); }
	 * else if (dbInteractionType.equals("hibernate")) { dao = new
	 * EmployeeDAOHibernateImpl(); } return dao; }
	 */
	
	@Bean("jdbc")
	public EmployeeDAO getInstanceJDBC() {
		return new EmployeeDAOJDBCImpl();
	}
	
	@Bean("hibernate")
	public EmployeeDAO getInstanceHibernate() {
		return new EmployeeDAOHibernateImpl();
	}
}
