package com.techchefs.javaapp.final1;
public class Example1 {
	
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		a2 = a1;
		a2.m = 34;
		a1.m1();
		a1.m2(20);
		final A a3 = new A();
		a3.l = 90;
		
	}

}
