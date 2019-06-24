package com.techchefs.javaapp.inheritance1;
public class Example1 {

	public static void main(String[] args) {
		ScitificCalc sc1 = new ScitificCalc();
		double a1 = sc1.add(3,4);
		double m1 = sc1.multiply(5, 8);
		sc1.sin();
		sc1.cos();
		System.out.println("a1 "+ a1);
		System.out.println("m1 "+m1);
		
		Calculator c1 = new Calculator();
		double a2 = c1.add(10, 20);
		double m2 = c1.multiply(5, 8);
		
		System.out.println("a2 "+ a2);
		System.out.println("m2 "+m2);
	}

}
