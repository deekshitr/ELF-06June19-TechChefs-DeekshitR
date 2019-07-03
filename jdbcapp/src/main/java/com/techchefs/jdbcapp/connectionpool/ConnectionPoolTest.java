package com.techchefs.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
public class ConnectionPoolTest {
	public static void main(String[] args) {
		
		ConnectionPool pool = null;
		Connection connectObj = null;
		String query = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			pool = ConnectionPool.getConnectionPool();
			connectObj = pool.getConnectionfromPool();
			
			//3.Issue "SQL Queries" via "Connection"
			query = "select * from employee_info";
			stmt = connectObj.createStatement();
			rs = stmt.executeQuery(query);  
			
			//4."Process the Results" returned by "SQL Queries"
			while(rs.next()) {
				log.info("	id             =====> "+rs.getInt("ID"));
				log.info("	name           =====> "+rs.getString("NAME"));
				log.info("	age            =====> "+rs.getInt("AGE"));     
				log.info("	gender         =====> "+rs.getString("GENDER"));
				log.info("	salary         =====> "+rs.getDouble("SALARY"));
				log.info("	phone          =====> "+rs.getLong("PHONE"));   
				log.info("	joining_date   =====> "+rs.getDate("JOINING_DATE"));    
				log.info("	acc_num        =====> "+rs.getLong("ACC_NUM"));
				log.info("	email          =====> "+rs.getString("EMAIL"));
				log.info("	designation    =====> "+rs.getString("DESIGNATION"));
				log.info("	dob            =====> "+rs.getDate("DOB"));
				log.info("	dept_id        =====> "+rs.getInt("DEPT_ID"));
				log.info("	manager_id     =====> "+rs.getInt("MANAGER_ID"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5.Close all the JDBC drivers
			
				try {  
					pool.returnConnectionToPool(connectObj);
			
					if (stmt!=null) {
						stmt.close();
					}
					if (rs!=null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}
}
