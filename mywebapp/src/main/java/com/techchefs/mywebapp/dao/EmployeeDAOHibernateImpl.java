package com.techchefs.mywebapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		try (Session session = HibernateUtil.openSession();) {
			String hql = "from EmployeeInfoBean";
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
		try (Session session = HibernateUtil.openSession();) {
			empInfo = session.get(EmployeeInfoBean.class, id);
			return empInfo;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	private boolean saveOrUpdate(EmployeeInfoBean empBean) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.openSession();) {
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

		try (Session session = HibernateUtil.openSession();) {
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
