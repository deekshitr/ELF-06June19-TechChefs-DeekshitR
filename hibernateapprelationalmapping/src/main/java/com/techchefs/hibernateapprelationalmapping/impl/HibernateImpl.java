package com.techchefs.hibernateapprelationalmapping.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapprelationalmapping.dto.EmployeeAddressInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeEducationInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.TrainingInfoBean;

public class HibernateImpl {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			return new Configuration()
					.configure("relationalHibernate.cfg.xml")
					.buildSessionFactory();
		} else {
			return sessionFactory;
		}
		
	}
	
	public void createEmployee(
			EmployeeInfoBean infoBean,
			EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBeans,
			List<EmployeeEducationInfoBean> educationInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		
		Session session = buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		for (EmployeeAddressInfoBean employAddressInfoBean: addressInfoBeans) {
			session.save(employAddressInfoBean);
		}
		
		for (EmployeeEducationInfoBean employEducationInfoBean: educationInfoBeans) {
			session.save(employEducationInfoBean);
		}
		for (EmployeeExperienceInfoBean employExperienceInfoBean: experienceInfoBeans) {
			session.save(employExperienceInfoBean);
		}
		transaction.commit();
		session.close();
	}
	
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session = buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		
		transaction.commit();
		session.close();
	}
	
}
