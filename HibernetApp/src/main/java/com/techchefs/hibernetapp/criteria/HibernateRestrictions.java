package com.techchefs.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateRestrictions {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr = Restrictions.eq("id", 1);                       
		criteria.add(cr);
		EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();
		
			log.info("Name ------> " +empInfo.getName());
			log.info("Id ------> " +empInfo.getId());
			log.info("Age ------> " +empInfo.getAge());
			log.info("Gender ------> " +empInfo.getGender());
			log.info("Salary ------> " +empInfo.getSalary());
			log.info("Phone ------> " +empInfo.getPhone());
	}
}
