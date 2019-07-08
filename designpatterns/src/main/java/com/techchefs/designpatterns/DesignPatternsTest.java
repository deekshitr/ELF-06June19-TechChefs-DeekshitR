package com.techchefs.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;
import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.designpatterns.dao.EmployeeDAOHibernateImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {

	private static void printEmpInfo(EmployeeInfoBean empInfo) {
		log.info("	id             =====> " + empInfo.getId());
		log.info("	name           =====> " + empInfo.getName());
		log.info("	age            =====> " + empInfo.getAge());
		log.info("	gender         =====> " + empInfo.getGender());
		log.info("	salary         =====> " + empInfo.getSalary());
		log.info("	phone          =====> " + empInfo.getPhone());
		log.info("	joining_date   =====> " + empInfo.getJoiningDate());
		log.info("	acc_num        =====> " + empInfo.getAccNum());
		log.info("	email          =====> " + empInfo.getEmail());
		log.info("	designation    =====> " + empInfo.getDesignation());
		log.info("	dob            =====> " + empInfo.getDob());
		log.info("	dept_id        =====> " + empInfo.getDepartmentId());
		log.info("	manager_id     =====> " + empInfo.getManagerId());
	}

	public static void main(String[] args) throws Exception {

		/* EmployeeDAO dao = new EmployeeDAOJDBCImpl(); */
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		
		/*
		 * printEmpInfo(dao.getEmployeeInfo(5)); printEmpInfo(dao.getEmployeeInfo("5"));
		 * 
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); Date
		 * joiningDate = dateFormat.parse("2018-02-17"); Date dob =
		 * dateFormat.parse("1991-04-17");
		 * 
		 * EmployeeInfoBean empInfo = new EmployeeInfoBean(); empInfo.setId(1);
		 * empInfo.setName("Kalpana"); empInfo.setAge(28); empInfo.setGender("F");
		 * empInfo.setSalary(278999); empInfo.setPhone(9988224422L);
		 * empInfo.setJoiningDate(joiningDate); empInfo.setAccNum(2299115599L);
		 * empInfo.setEmail("h@gmail.com"); empInfo.setDesignation("Tester");
		 * empInfo.setDob(dob); empInfo.setDepartmentId(2); empInfo.setManagerId(5);
		 * 
		 * log.info("Inserted employee data "+dao.createEmployeeInfo(empInfo));
		 * 
		 * log.info("Deleted data employee data "+dao.deleteEmployeeInfo(8));
		 */
		
		  ArrayList<EmployeeInfoBean> empBeans = dao.getAllEmployeeInfo();
		  
		  for (EmployeeInfoBean bean : empBeans) { printEmpInfo(bean); }
		 

	}
}
