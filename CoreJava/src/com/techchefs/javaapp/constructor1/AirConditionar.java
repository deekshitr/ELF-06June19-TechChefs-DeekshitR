package com.techchefs.javaapp.constructor1;

public class AirConditionar {
	int AirConditionar() {
		System.out.println("constructor called ");
		return 1;
	}
	
	AirConditionar(int x) {
		System.out.println("constructor called "+x);
	}
	AirConditionar(double x) {
		System.out.println("constructor called "+x);
	}
	AirConditionar(String x, int y, double z) {
		System.out.println("constructor called "+ x+" "+y+" "+z);
	}
}
