package com.techchefs.hibernetapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "from EmployeeInfoBean";
		
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();
		for (EmployeeInfoBean employeeInfoBean: employeeInfoBeans) {
			log.info("Name ------> " +employeeInfoBean.getName());
			log.info("Id ------> " +employeeInfoBean.getId());
			log.info("Age ------> " +employeeInfoBean.getAge());
			log.info("Gender ------> " +employeeInfoBean.getGender());
			log.info("Salary ------> " +employeeInfoBean.getSalary());
			log.info("Phone ------> " +employeeInfoBean.getPhone());
		}
		
	}
}
