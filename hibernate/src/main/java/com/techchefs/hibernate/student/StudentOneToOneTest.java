package com.techchefs.hibernate.student;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techchefs.hibernate.dto.StudentInfo;
import com.techchefs.hibernate.dto.StudentOtherInfo;
import com.techchefs.hibernate.util.HibernateUtil;

public class StudentOneToOneTest {

	public static void main(String[] args) {
		
Transaction transaction = null;
		
		StudentInfo studentInfoBean = new StudentInfo();
		studentInfoBean.setRollNum(1);
		studentInfoBean.setName("eshwar");
		studentInfoBean.setAge(36);
		studentInfoBean.setGender("Male");
		studentInfoBean.setMobileNo(9999999999L);
		studentInfoBean.setEmailId("d@gmail.com");
		
		StudentOtherInfo studentOtherInfo = new StudentOtherInfo();
		studentOtherInfo.setRollNum(1);
		studentOtherInfo.setFatherName("Satish");
		studentOtherInfo.setMotherName("Radha");
		studentOtherInfo.setReligion("Hindu");
		studentOtherInfo.setNationality("Indian");
		
		studentInfoBean.setStudentOtherInfo(studentOtherInfo);
		
		try (Session session = HibernateUtil.openSession();) {
			transaction = session.beginTransaction();
			session.saveOrUpdate(studentInfoBean);
			transaction.commit();
		} catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		}
	}

}
