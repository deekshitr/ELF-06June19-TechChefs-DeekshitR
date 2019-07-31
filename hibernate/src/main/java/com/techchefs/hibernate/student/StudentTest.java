package com.techchefs.hibernate.student;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernate.dto.ProductBean;
import com.techchefs.hibernate.dto.StudentBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.openSession();
		
		Criteria criteria = session.createCriteria(StudentBean.class);
		
		Projection projection1 = Projections.property("firstName");
		Projection projection2 = Projections.property("totalMarks");
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		
		List<Object[]> names =  criteria.list();
		
		for(Object[] name: names) {
			log.info("firstName : "+ name[0]);
			log.info("totalMarks : "+ name[1]);
		}
				
	}
}
