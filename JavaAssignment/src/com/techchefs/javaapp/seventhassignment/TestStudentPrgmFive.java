package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentPrgmFive is a main class storing Student data 
 * to display the Student name with titles using Stream 
 * 
 */

//SOLUTION :
@Log
public class TestStudentPrgmFive {

	public static void main(String[] args) {

		Student s1 = new Student("Nistha", 4, 77.0, "Female");
		Student s2 = new Student("Rahul", 3, 87.0, "male");
		Student s3 = new Student("Nikita", 2, 29.7, "Female");
		Student s4 = new Student("sakshi", 1, 30.9, "Female");
		Student s5 = new Student("shruti", 5, 57.6, "Female");

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Function<Student, String> f = str -> {
			String new1 = null;
			if (str.getGender().equals("male") ) {
				new1 = "Mr." + str.getName();
			} else {
				new1 = "Ms." + str.getName();
			}
			return new1;
		};

		List<String> l = al.stream().map(f).collect(Collectors.toList());

		log.info("Student name is " + l);

	}// end of main

}// end of class
