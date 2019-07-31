package com.techchefs.hibernate.customer.storedProcedure;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.StudentBean;
import com.techchefs.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StudentStoredProcedureTest {

	public static void main(String[] args) {
				
		try (Session session = HibernateUtil.openSession();) {
			StoredProcedureQuery query = session.createStoredProcedureCall("student_Stored_pro", StudentBean.class);
			List<StudentBean> studentList = query.getResultList();
			
			for (StudentBean student:studentList) {
				log.info("student roll number : "+student.getRollNum());
				log.info("student first name : "+student.getFirstName());
				log.info("student last name : "+student.getLastName());
				log.info("student subject : "+student.getSubject());
				log.info("student total marks : "+student.getTotalMarks());
			}
		}
		
		
	}

}
