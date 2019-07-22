package com.techchefs.empspringmvc.dao;

import java.util.ArrayList;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	ArrayList<EmployeeInfoBean> getMatchedEmployeeInfo(String empSearchValue);
	EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeeInfoBean empBean);
	boolean updateEmployeeInfo(EmployeeInfoBean empBean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}
