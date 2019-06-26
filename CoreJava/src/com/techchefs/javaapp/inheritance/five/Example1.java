package com.techchefs.javaapp.inheritance.five;
public class Example1 {

	public static void main(String[] args) {
		Phone m1 = new MiPhone();
		Phone m2 = new IPhone();
		Girl g1 = new Girl();
		g1.recieve(m1);
		g1.recieve(m2);

	}

}
