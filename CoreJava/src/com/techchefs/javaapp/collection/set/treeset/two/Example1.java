package com.techchefs.javaapp.collection.set.treeset.two;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>();
		Student s1 = new Student();
		s1.name = "Raghu";
		s1.id = 100;
		s1.percentage = 74.34;

		Student s2 = new Student();
		s2.name = "Manu";
		s2.id = 101;
		s2.percentage = 68.76;

		Student s3 = new Student();
		s3.name = "Priya";
		s3.id = 102;
		s3.percentage = 89.43;

		Student s4 = new Student();
		s4.name = "Ankitha";
		s4.id = 103;
		s4.percentage = 97.34;

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println("using foreach*************************************");

		for (Student s : ts) {
			System.out.println("student name: " + s.name);
			System.out.println("student id: " + s.id);
			System.out.println("student percentage: " + s.percentage);
			System.out.println("\n");
		}

	}

}
