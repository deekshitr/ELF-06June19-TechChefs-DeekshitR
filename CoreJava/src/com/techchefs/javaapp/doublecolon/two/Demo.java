package com.techchefs.javaapp.doublecolon.two;

import lombok.extern.java.Log;

@Log
public class Demo {
	static int sum(int a,int b) {
		int c = a+b;
		log.info("Sum: "+c);
		return c;
	}
	
	
}
