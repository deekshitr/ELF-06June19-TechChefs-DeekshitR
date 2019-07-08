package com.techchefs.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateProjections {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro = Projections.property("name");
		criteria.setProjection(pro);
		List<String> str = criteria.list();
		for(String empName: str) {
			log.info("Name ------> " +empName);
		}
	}
}
