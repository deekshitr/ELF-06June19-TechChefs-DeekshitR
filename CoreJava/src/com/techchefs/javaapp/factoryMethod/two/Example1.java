package com.techchefs.javaapp.factoryMethod.two;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class Example1 {

	public static void main(String[] args) {
		Student s1= new Student("Adarsh", 74,92,76);
		s1.avg(s1);
		
		Consumer<Student> c = s-> {
			double a = (s.m1+s.m2+s.m3)/3.0;
			log.info("avg using consumer: "+a);
		};
		
		c.accept(s1);
	}

}
