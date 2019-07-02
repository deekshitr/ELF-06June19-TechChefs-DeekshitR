package com.techchefs.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class A implements Connection {
	public void printMessage() {
		log.info("aaa");
	}
}
