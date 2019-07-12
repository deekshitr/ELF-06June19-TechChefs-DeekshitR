package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentPrgmTen is a main class storing Student data 
 * and display using For each and stream
 * 
 */

//SOLUTION :

@Log
public class TestStudentPrgmTen {

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
		
		
		al.stream().forEach(i->log.info("Students Id are :" + i.getId()));
		log.info("************************************************************");
		al.stream().forEach(i->log.info("Students Name are :" + i.getName()));
		log.info("************************************************************");
		al.stream().forEach(i->log.info("Students Percent are :" + i.getPercent()));
		
		
	}//end of main

}//end of class
