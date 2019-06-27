package com.techchefs.javaapp.stream.four;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	static Comparator<Student> c = (a, b) -> {
		if (a.getPercentage() > b.getPercentage()) {
			return 1;
		} else if (a.getPercentage() < b.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();
	}

	static Student getPapper(ArrayList<Student> al) {

		return al.stream().min(c).get();
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Rakesh");
		s1.setPercentage(74.23);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Anamika");
		s2.setPercentage(34.75);

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Umesh");
		s3.setPercentage(93.23);

		Student s4 = new Student();
		s4.setId(4);
		s4.setName("Tarun");
		s4.setPercentage(45.43);

		Student s5 = new Student();
		s5.setId(1);
		s5.setName("Rakesh");
		s5.setPercentage(74.23);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Student stud1 = getTopper(al);
		log.info("Topper is " + stud1.getName() + " with percentage " + stud1.getPercentage());

		Student stud2 = getPapper(al);
		log.info("Papper is " + stud2.getName() + " with percentage " + stud2.getPercentage());

	}

}
