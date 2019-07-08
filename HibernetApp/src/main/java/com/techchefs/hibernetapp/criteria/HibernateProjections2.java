package com.techchefs.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernetapp.dto.EmployeeInfoBean;
import com.techchefs.hibernetapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateProjections2 {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection pro1 = Projections.property("id");
		Projection pro2 = Projections.property("name");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(pro1);
		projectionList.add(pro2);
		
		criteria.setProjection(projectionList);
		List<Object[]> strArr = criteria.list();
		for(Object[] str: strArr) {
			log.info("Id ------> " +str[0]);
			log.info("Name ------> " +str[1]);
		}
	}
}
