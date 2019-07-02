package com.techchefs.jdbcapp.common;

import lombok.extern.java.Log;

@Log
public class B implements Connection {
	public void printMessage() {
		log.info("bbb");
	}
}
