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
public class HibernateRestrictions2 {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr1 = Restrictions.gt("salary", 65000.00);
		criteria.add(cr1);
		List<EmployeeInfoBean> empInfo = criteria.list();
		
		for (EmployeeInfoBean employeeInfoBean: empInfo) {
			log.info("Name ------> " +employeeInfoBean.getName());
			log.info("Id ------> " +employeeInfoBean.getId());
			log.info("Age ------> " +employeeInfoBean.getAge());
			log.info("Gender ------> " +employeeInfoBean.getGender());
			log.info("Salary ------> " +employeeInfoBean.getSalary());
			log.info("Phone ------> " +employeeInfoBean.getPhone());
		}
	}
}
