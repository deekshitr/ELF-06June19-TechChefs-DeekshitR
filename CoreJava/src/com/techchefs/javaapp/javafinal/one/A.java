package com.techchefs.javaapp.javafinal.one;

public class A {
	final int i=10;
	int m=20;
	public int l=30;
	
	final int r;
	
	A() {
		r=100;
	}
	
	void m1() {
		final int k =30;
		System.out.println("i: "+i+" k: "+k);
	}
	void m2(final int j) {
		System.out.println("j "+j);
	}
	
	final void m3() {
		System.out.println("final m3 method");
	}
	final void m3(int q) {
		System.out.println("final m4 method");
	}
}
