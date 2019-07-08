package com.techchefs.hibernetapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("get_all_emp_info",EmployeeInfoBean.class);
		List<EmployeeInfoBean> empList= query.getResultList();
		
		for (EmployeeInfoBean employeeInfoBean: empList) {
			log.info("Name ------> " +employeeInfoBean.getName());
			log.info("Id ------> " +employeeInfoBean.getId());
			log.info("Age ------> " +employeeInfoBean.getAge());
			log.info("Gender ------> " +employeeInfoBean.getGender());
			log.info("Salary ------> " +employeeInfoBean.getSalary());
			log.info("Phone ------> " +employeeInfoBean.getPhone());
		}
	}
}
