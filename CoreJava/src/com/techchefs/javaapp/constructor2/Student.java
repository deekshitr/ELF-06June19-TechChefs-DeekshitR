package com.techchefs.javaapp.constructor2;

public class Student {
	int age;
	String name;
	double percentage;
	
	Student(int age, String name, double percentage){
		this.age=age;
		this.name = name;
		this.percentage = percentage;
	}
	void print() {
		System.out.println(name+" with age "+age+" has obtained "+percentage);
	}
}
