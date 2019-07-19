package com.techchefs.hibernetapp.onetoone;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernetapp.util.HibernateUtil;
import com.techchefs.hibernetapp.util.PrepareDateUtil;

import lombok.extern.java.Log;

@Log
public class OneToOneTest {

	public static void main(String[] args) throws Exception {

		// Prepare data
		int id = 100;

		EmployeeInfoBean employeeInfoBean = PrepareDateUtil.prepareData(id);
		save(employeeInfoBean);
	}

	private static void save(EmployeeInfoBean employeeInfoBean) {
		// Save
		Transaction txn = null;
		try (Session session = HibernateUtil.getSession();) {
			txn = session.beginTransaction();
			session.save(employeeInfoBean);
			txn.commit();
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
		}
	}

}
