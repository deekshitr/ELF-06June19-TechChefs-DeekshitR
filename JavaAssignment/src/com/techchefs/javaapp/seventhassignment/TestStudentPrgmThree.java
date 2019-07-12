package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentPrgmThree is a main class storing Student data 
 * to filter the Student percentage using Stream 
 * 
 */

//SOLUTION :
@Log
public class TestStudentPrgmThree {
	
	public static void main(String[] args) {

		Student s1 = new Student("Nistha", 4, 77.0,"Female");
		Student s2 = new Student("Rahul", 3, 87.0,"male");
		Student s3 = new Student("Nikita", 2, 29.7,"Female");
		Student s4 = new Student("sakshi", 1, 30.9,"Female");
		Student s5 = new Student("shruti", 5, 57.6,"Female");
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		List<Student> per =  al.stream().filter(i->i.getPercent()<=35.0).collect(Collectors.toList());
		/*
		 * for (Student s : per) {
		 * 
		 * log.info("Name is :" + s.getName() + " with " + "percentage is :" +
		 * s.getPercent());
		 * 
		 * }
		 */
		
		per.stream().forEach(a->log.info("percentage is :" + a.getPercent()));
		
		
	}//end of main

}//end of class
