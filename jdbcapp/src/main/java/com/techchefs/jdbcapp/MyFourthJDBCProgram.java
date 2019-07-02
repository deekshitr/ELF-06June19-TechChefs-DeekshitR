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
public class MyFourthJDBCProgram {
	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		Statement stmt = null;
		int rsNum = 0;
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
			query = "insert into employee_info values(6,'Ramya',26,'F',45000,5566778833,'2018-06-21',"
					+ "1100228833,'f@gmail.com','Software Engineer','1992-10-23',1,1)";
			stmt = con.createStatement();
			rsNum = stmt.executeUpdate(query);  
			log.info("rs : "+ rsNum);
			
			query = "select * from employee_info where id=6";
			rsObj = stmt.executeQuery(query);  
			
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
					if (stmt!=null) {
						stmt.close();
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}
}
