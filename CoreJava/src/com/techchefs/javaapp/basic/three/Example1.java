package com.techchefs.javaapp.basic.three;

public class Example1 {
	public static void main(String[] args) {
		Pen p1 = new Marker();
		//p1.cost();
		//p1.write();
		
		Marker m1 = new Marker();
		m1.write();
		Pen p2 = new Pen();
		p2.write();
		Pen p3 = new Marker();
		p3.write();
	}
}
