package com.techchefs.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> emplist = criteria.list();
		
		for(EmployeeInfoBean employeeInfoBean: emplist) {
			log.info("Name ------> " +employeeInfoBean.getName());
			log.info("Id ------> " +employeeInfoBean.getId());
			log.info("Age ------> " +employeeInfoBean.getAge());
			log.info("Gender ------> " +employeeInfoBean.getGender());
			log.info("Salary ------> " +employeeInfoBean.getSalary());
			log.info("Phone ------> " +employeeInfoBean.getPhone());
		}
	}
	
}
