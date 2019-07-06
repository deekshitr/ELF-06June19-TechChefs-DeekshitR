package com.techchefs.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
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
		cfg.configure();
		/*
		 * cfg.configure(); cfg.configure("myhibernate.xml"); cfg.configure(new
		 * File("D://myhibernate.xml");
		 */
		/*
		 * try { cfg.configure(new URL(
		 * "https://raw.githubusercontent.com/deekshitr/ELF-06June19-TechChefs-DeekshitR/master/myhibernate.xml"
		 * )); } catch (HibernateException | MalformedURLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
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

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean empBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean empBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
