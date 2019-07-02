package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
public class MyThirdJDBCProgram {
	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		PreparedStatement preStmt = null;
		ResultSet rsObj = null;
		
		try {
			//1.load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//2.get the db connected to the driver
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			
			log.info("connection impl class"+ con.getClass());
			
			//3.Issue "SQL Queries" via "Connection"
			
			query = "select * from employee_info where id=?";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, Integer.parseInt(args[0]));
			rsObj = preStmt.executeQuery();  
			
			//4."Process the Results" returned by "SQL Queries"
			while(rsObj.next()) {
				log.info("	id             =====> "+rsObj.getInt("ID"));
				log.info("	name           =====> "+rsObj.getString("NAME"));
				log.info("	age            =====> "+rsObj.getInt("AGE"));     
				log.info("	gender         =====> "+rsObj.getString("GENDER"));
				log.info("	salary         =====> "+rsObj.getDouble("SALARY"));
				log.info("	phone          =====> "+rsObj.getLong("PHONE"));   
				log.info("	joining_date   =====> "+rsObj.getDate("JOINING_DATE"));    
				log.info("	acc_num        =====> "+rsObj.getLong("ACC_NUM"));
				log.info("	email          =====> "+rsObj.getString("EMAIL"));
				log.info("	designation    =====> "+rsObj.getString("DESIGNATION"));
				log.info("	dob            =====> "+rsObj.getDate("DOB"));
				log.info("	dept_id        =====> "+rsObj.getInt("DEPT_ID"));
				log.info("	manager_id     =====> "+rsObj.getInt("MANAGER_ID"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5.Close all the JDBC drivers
			
				try {  
					if (con!=null) {
						con.close();
					}
					if (preStmt!=null) {
						preStmt.close();
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}
}
