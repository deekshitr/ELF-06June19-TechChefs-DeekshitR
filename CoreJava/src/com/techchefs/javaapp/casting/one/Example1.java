package com.techchefs.javaapp.casting.one;
public class Example1 {

	public static void main(String[] args) {
		Animal a1 = new Cow();
		a1.i = 10;
		a1.walk();
		System.out.println(a1.i);
		Cow c1 = (Cow)a1;
		c1.j=20;
		c1.eat();
		System.out.println(c1.j);

	}

}
