package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
public class MyFirstJDBCProgram {
	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1.load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			//2.get the db connected to the driver
//			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
//			con = DriverManager.getConnection(dbUrl);
			
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db";
			
			con = DriverManager.getConnection(dbUrl, "root", "root");   
			
			log.info("connection impl class"+ con.getClass());
			
			//3.Issue "SQL Queries" via "Connection"
			query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);  
			
			//4."Process the Results" returned by "SQL Queries"
			while(rs.next()) {
//				log.info("	id             =====> "+rs.getInt("ID"));
//				log.info("	name           =====> "+rs.getString("NAME"));
				
				log.info("	id             =====> "+rs.getInt(1));
				log.info("	name           =====> "+rs.getString(2));
				
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
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5.Close all the JDBC drivers
			
				try {  
					if (con!=null) { 
						con.close();
					}
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
