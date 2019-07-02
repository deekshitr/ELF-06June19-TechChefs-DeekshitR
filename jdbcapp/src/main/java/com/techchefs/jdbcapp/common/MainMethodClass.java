package com.techchefs.jdbcapp.common;

public class MainMethodClass {

	public static void main(String[] args) {
		
		String dbUrl = "one";
		
		Connection ref = DriverManager.getConnection(dbUrl);
		ref.printMessage();
	}

}
