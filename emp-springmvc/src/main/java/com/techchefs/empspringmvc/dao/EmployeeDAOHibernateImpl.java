package com.techchefs.empspringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.beans.EmployeeOtherInfoBean;
import com.techchefs.empspringmvc.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		try (Session session = sessionFactory.openSession();) {
			String hql = "from EmployeeInfoBean";
			Query query = session.createQuery(hql);
			return (ArrayList<EmployeeInfoBean>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public ArrayList<EmployeeInfoBean> getMatchedEmployeeInfo(String empSearchValue) {
		
		try (Session session = sessionFactory.openSession();) {
			String hql = "from EmployeeInfoBean where str(id) like '"+empSearchValue+"%'";
			Query query = session.createQuery(hql);
			return (ArrayList<EmployeeInfoBean>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
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

		EmployeeInfoBean empInfo;
		try (Session session = sessionFactory.openSession();) {
			empInfo = session.get(EmployeeInfoBean.class, id);
			return empInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	private boolean saveOrUpdate(EmployeeInfoBean empBean) {
		Transaction transaction = null;

		try (Session session = sessionFactory.openSession();) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(empBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
			
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

		try (Session session = sessionFactory.openSession();) {
			transaction = session.beginTransaction();
			session.delete(session.get(EmployeeInfoBean.class, id));
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		}

	}
                                                                                               
	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
