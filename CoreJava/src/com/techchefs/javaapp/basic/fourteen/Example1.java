package com.techchefs.javaapp.basic.fourteen;

public class Example1 {

	public static void main(String[] args) {
		
		Pen a = Pen.getPen();
		System.out.println("pen brand : "+ a.brand);
		Pen b = Pen.getPen();
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		
	}

}
