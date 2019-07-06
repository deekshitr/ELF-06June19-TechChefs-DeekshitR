package com.techchefs.designpatterns.dao;

import java.util.ArrayList;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	boolean createEmployeeInfo(EmployeeInfoBean empBean);
	boolean updateEmployeeInfo(EmployeeInfoBean empBean);
	boolean deleteEmployeeInfo(int id);
	boolean deleteEmployeeInfo(String id);
}
