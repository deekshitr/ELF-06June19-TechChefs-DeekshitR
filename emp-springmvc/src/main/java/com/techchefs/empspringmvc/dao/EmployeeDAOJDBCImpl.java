package com.techchefs.empspringmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
		String query = "select * from employee_info";
		EmployeeInfoBean empInfo = null;

		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rsObj = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> empBeans = new ArrayList<EmployeeInfoBean>();
			empInfo = new EmployeeInfoBean();
			
			// 4."Process the Results" returned by "SQL Queries"
			while (rsObj.next()) {
				empInfo.setId(rsObj.getInt("ID"));
				empInfo.setName(rsObj.getString("NAME"));
				empInfo.setAge(rsObj.getInt("AGE"));
				empInfo.setGender(rsObj.getString("GENDER"));
				empInfo.setSalary(rsObj.getDouble("SALARY"));
				empInfo.setPhone(rsObj.getLong("PHONE"));
				empInfo.setJoiningDate(rsObj.getDate("JOINING_DATE"));
				empInfo.setAccNum(rsObj.getLong("ACC_NUM"));
				empInfo.setEmail(rsObj.getString("EMAIL"));
				empInfo.setDesignation(rsObj.getString("DESIGNATION"));
				empInfo.setDob(rsObj.getDate("DOB"));
				empInfo.setDepartmentId(rsObj.getInt("DEPT_ID"));
				empInfo.setManagerId(rsObj.getInt("MANAGER_ID"));
				empBeans.add(empInfo);
			}
			
			return empBeans;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} 
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			log.info("e" + e);
			return null;
		}

	}

	public EmployeeInfoBean getEmployeeInfo(int id) {

		Connection con = null;
		String query = null;
		PreparedStatement preStmt = null;
		ResultSet rsObj = null;
		EmployeeInfoBean empInfo = null;

		try {
			// 1.load the driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2.get the db connected to the driver
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);

			log.info("connection impl class" + con.getClass());

			// 3.Issue "SQL Queries" via "Connection"

			query = "select * from employee_info where id=?";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, id);
			rsObj = preStmt.executeQuery();

			// 4."Process the Results" returned by "SQL Queries"

			empInfo = new EmployeeInfoBean();

			while (rsObj.next()) {

				empInfo.setId(rsObj.getInt("ID"));
				empInfo.setName(rsObj.getString("NAME"));
				empInfo.setAge(rsObj.getInt("AGE"));
				empInfo.setGender(rsObj.getString("GENDER"));
				empInfo.setSalary(rsObj.getDouble("SALARY"));
				empInfo.setPhone(rsObj.getLong("PHONE"));
				empInfo.setJoiningDate(rsObj.getDate("JOINING_DATE"));
				empInfo.setAccNum(rsObj.getLong("ACC_NUM"));
				empInfo.setEmail(rsObj.getString("EMAIL"));
				empInfo.setDesignation(rsObj.getString("DESIGNATION"));
				empInfo.setDob(rsObj.getDate("DOB"));
				empInfo.setDepartmentId(rsObj.getInt("DEPT_ID"));
				empInfo.setManagerId(rsObj.getInt("MANAGER_ID"));
			}

			return empInfo;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;

		} finally {
			// 5.Close all the JDBC drivers

			try {
				if (con != null) {
					con.close();
				}
				if (preStmt != null) {
					preStmt.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean empBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean empBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<EmployeeInfoBean> getMatchedEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
