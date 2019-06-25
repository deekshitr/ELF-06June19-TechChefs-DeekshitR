package com.techchefs.javaapp.doublecolon4;

import lombok.extern.java.Log;

@Log
public class Pen {
	
	Pen() {
		log.info("i am pen constructor with 0 param");
	}
	
	Pen(int i) {
		log.info("i am pen constructor with 1 param");
	}
	
	void write() {
		log.info("i am write() method");
	}
}
