package com.techchefs.javaapp.doublecolon3;

import lombok.extern.java.Log;

@Log
public class MyStudent {
	void calculateAvg(int a, int b, int c) {
		double r = (a+b+c)/3.0;
		log.info("avg: "+r);
	}
	
	int myFactorial(int num) {
		int fact = 1;
		for (int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
