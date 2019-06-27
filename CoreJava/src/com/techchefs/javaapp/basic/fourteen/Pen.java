package com.techchefs.javaapp.basic.fourteen;

public class Pen {
	String brand = "Parker";
	private final static Pen p = new Pen();
	private Pen() {
		
	}
	
	public static Pen getPen() {
		return p;
	}
}
