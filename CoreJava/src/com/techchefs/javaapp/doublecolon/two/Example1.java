package com.techchefs.javaapp.doublecolon.two;

import lombok.extern.java.Log;

@Log
public class Example1 {
	static int sum(int a,int b) {
		int c = a+b;
		log.info("Sum: "+c);
		return c;
	}
	public static void main(String[] args) {
		
		Math m1 = Example1 :: sum;
		int i = m1.add(34, 35);
		log.info("Sum: "+i);
		
		Math m2 = Demo :: sum;
		int j = m2.add(56, 78);
		log.info("Sum: "+j);
		
		
	}

}
