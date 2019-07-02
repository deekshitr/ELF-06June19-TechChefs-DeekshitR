package com.techchefs.jdbcapp.common;

public class DriverManager {

	public static Connection getConnection(String str) {

		Connection ref = null;

		if (str.contentEquals("one")) {
			ref = new A();
			return ref;
		} else {
			ref = new B();
			return ref;
		}
	}
}
