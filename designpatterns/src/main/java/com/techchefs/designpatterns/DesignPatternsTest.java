package com.techchefs.designpatterns;

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

	public static void main(String[] args) {

		/* EmployeeDAO dao = new EmployeeDAOJDBCImpl(); */
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printEmpInfo(dao.getEmployeeInfo(1));
		printEmpInfo(dao.getEmployeeInfo("2"));

		/*
		 * ArrayList<EmployeeInfoBean> empBeans = dao.getAllEmployeeInfo();
		 * 
		 * for (EmployeeInfoBean bean : empBeans) { printEmpInfo(bean); }
		 */

	}
}
