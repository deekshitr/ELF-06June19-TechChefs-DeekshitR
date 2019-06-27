package com.techchefs.javaapp.basic.two;


class Pen {
		int cost;
		String name;
		void write() {
			System.out.println("Pen Writing");
		}
	}

class Person {
	double height;
	int weight;
	String name;
	boolean isHandicap;
	String color;
	void talk() {
		System.out.println("Person Talking");
	}
	void walk() {
		System.out.println("Person Walking");
	}
}

public class Example1 {
	
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.cost = 20;
		p1.name = "Renoyls";
		p1.write();
		System.out.println(p1.name + " costs " + p1.cost);
		
		Person per1 = new Person();
		per1.height= 5.10;
		per1.weight = 76;
		per1.name = "Deekshit R";
		per1.isHandicap = false;
		per1.color = "Brown";
		per1.talk();
		per1.walk();
		System.out.println(per1.name + " is of height "+per1.height+" feet and weight "+per1.weight+" and has color "+per1.color);

	}

}
