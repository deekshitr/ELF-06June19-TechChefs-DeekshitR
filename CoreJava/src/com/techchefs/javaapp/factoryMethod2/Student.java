package com.techchefs.javaapp.factoryMethod2;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;
	int m1;
	int m2;
	int m3;
	
	public Student(String name, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	void avg(Student s) {
		double a = (s.m1+s.m2+s.m3)/3.0;
		log.info("avg: "+a);
	}

}
