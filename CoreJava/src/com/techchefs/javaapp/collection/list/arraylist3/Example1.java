package com.techchefs.javaapp.collection.list.arraylist3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
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

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		System.out.println("using for*************************************");

		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("student name: " + s.name);
			System.out.println("student id: " + s.id);
			System.out.println("student percentage: " + s.percentage);
			System.out.println("\n");

		}

		System.out.println("using foreach*************************************");

		for (Student s : al) {
			System.out.println("student name: " + s.name);
			System.out.println("student id: " + s.id);
			System.out.println("student percentage: " + s.percentage);
			System.out.println("\n");
		}

		System.out.println("using iterator*************************************");

		Iterator<Student> it = al.iterator();

		while (it.hasNext()) {
			Student s = it.next();

			System.out.println("student name: " + s.name);
			System.out.println("student id: " + s.id);
			System.out.println("student percentage: " + s.percentage);
			System.out.println("\n");

		}

		System.out.println("using listIterator*************************************");

		ListIterator<Student> li = al.listIterator();

		while (li.hasNext()) {
			Student s = li.next();

			System.out.println("student name: " + s.name);
			System.out.println("student id: " + s.id);
			System.out.println("student percentage: " + s.percentage);
			System.out.println("\n");

		}

	}

}
