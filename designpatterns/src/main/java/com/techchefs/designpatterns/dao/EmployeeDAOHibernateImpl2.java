package com.techchefs.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;
import com.techchefs.designpatterns.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl2 implements EmployeeDAO {

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
		Session session = HibernateUtil.openSession();
		EmployeeInfoBean empInfo = session.get(EmployeeInfoBean.class, id);
		session.close();
		return empInfo;
	}

	private boolean saveOrUpdate(EmployeeInfoBean empBean) {
		Transaction transaction = null; 
		try {
			Session session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(empBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean empBean) {
		return saveOrUpdate(empBean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean empBean) {
		return saveOrUpdate(empBean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction transaction = null; 
		
		try {
			Session session = HibernateUtil.openSession();
			transaction = session.beginTransaction();
			session.delete(session.get(EmployeeInfoBean.class,id));
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
