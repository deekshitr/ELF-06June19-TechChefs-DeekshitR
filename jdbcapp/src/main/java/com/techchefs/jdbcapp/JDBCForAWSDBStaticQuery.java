package com.techchefs.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class JDBCForAWSDBStaticQuery {

	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://testyantramysql.czegtkctd7xi.ap-south-1.rds.amazonaws.com:3306/techchefs_db";
		String query = "select * from employee_info";

		try (Connection con = DriverManager.getConnection(dbUrl, "root", "deekshitr123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);) {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 4."Process the Results" returned by "SQL Queries"
			while (rs.next()) {
				log.info("	id             =====> " + rs.getInt("ID"));
				log.info("	name           =====> " + rs.getString("NAME"));
				log.info("	age            =====> " + rs.getInt("AGE"));
				log.info("	gender         =====> " + rs.getString("GENDER"));
				log.info("	salary         =====> " + rs.getDouble("SALARY"));
				log.info("	phone          =====> " + rs.getLong("PHONE"));
				log.info("	joining_date   =====> " + rs.getDate("JOINING_DATE"));
				log.info("	acc_num        =====> " + rs.getLong("ACC_NUM"));
				log.info("	email          =====> " + rs.getString("EMAIL"));
				log.info("	designation    =====> " + rs.getString("DESIGNATION"));
				log.info("	dob            =====> " + rs.getDate("DOB"));
				log.info("	dept_id        =====> " + rs.getInt("DEPT_ID"));
				log.info("	manager_id     =====> " + rs.getInt("MANAGER_ID"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
