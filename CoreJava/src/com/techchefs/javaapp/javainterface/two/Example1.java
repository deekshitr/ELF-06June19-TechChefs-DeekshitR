package com.techchefs.javaapp.javainterface.two;
public class Example1 {

	public static void main(String[] args) {
		Mammal m1 = new Mammal();
		m1.eat();
		m1.run();
		
		System.out.println(Animal.eat());
		System.out.println(Animal.str.length());
		
	}

}
