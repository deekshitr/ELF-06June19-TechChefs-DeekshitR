package com.techchefs.javaapp.basic.six;

public class B extends A{
	int i=60;
	void m1() {
		int i=30;
		System.out.println("i :"+i);
		System.out.println("this i :"+this.i);
		System.out.println("super i :"+super.i);
	}
}
