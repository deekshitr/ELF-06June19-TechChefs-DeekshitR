package com.techchefs.designpatterns.dao;

import java.io.File;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			log.info("e" + e);
			return null;
		}
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1.load the config file
		Configuration cfg = new Configuration();
		/*
		 * cfg.configure("hibernate.cfg.xml");
		 */		
		cfg.configure(new File("D://myhibernate.xml"));
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2.Build the session factory
		SessionFactory factory = cfg.buildSessionFactory();
		//3.open session
		Session ses = factory.openSession();
		
		//4.interact with DB via session
		EmployeeInfoBean empInfo = ses.get(EmployeeInfoBean.class, id);
		
		//5.close session
		ses.close();

		return empInfo;

	}

}
