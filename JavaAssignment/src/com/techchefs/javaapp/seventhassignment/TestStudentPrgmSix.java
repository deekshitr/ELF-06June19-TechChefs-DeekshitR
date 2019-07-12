package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentPrgmSix is a main class storing Student data 
 * and sorting students by ID using For each and stream
 * 
 */

//SOLUTION :
@Log
public class TestStudentPrgmSix {


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
		
		Comparator<Student> c = (i,j) ->{
			Integer i1 = i.getId();
			Integer i2 = j.getId();
			
			return i1.compareTo(i2);
		};
	
		
		List<Student> l = al.stream().sorted(c).collect(Collectors.toList());
		
		l.stream().forEach(a->log.info("Students id in sorted order:" + a.getId()));
		
	}//end of main

}//end of class

