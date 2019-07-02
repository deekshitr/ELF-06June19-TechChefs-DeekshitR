package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
public class MySixthJDBCProgram {
	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		PreparedStatement preStmt = null;
		int rsNum = 0;
		
		try {
			//1.load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//2.get the db connected to the driver
			String dbUrl = "jdbc:mysql://localhost:3306/techchefs_db?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			
			log.info("connection impl class"+ con.getClass());
			
			//3.Issue "SQL Queries" via "Connection"

			query = "insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preStmt = con.prepareStatement(query);
			preStmt.setInt(1, Integer.parseInt(args[0]));
			preStmt.setString(2,(args[1]));
			preStmt.setInt(3, Integer.parseInt(args[2]));
			preStmt.setString(4, args[3]);
			preStmt.setInt(5, Integer.parseInt(args[4]));
			preStmt.setLong(6, Long.parseLong(args[5]));
			preStmt.setString(7, args[6]);
			preStmt.setLong(8, Long.parseLong(args[7]));
			preStmt.setString(9,args[8]);
			preStmt.setString(10, args[9]);
			preStmt.setString(11, args[10]);
			preStmt.setInt(12, Integer.parseInt(args[11]));
			preStmt.setInt(13, Integer.parseInt(args[12]));
			
			rsNum = preStmt.executeUpdate();  
			log.info("rs : "+ rsNum);
			
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
