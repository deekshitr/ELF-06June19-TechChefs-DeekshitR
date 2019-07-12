package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestEmployeePrgmEight is a main class displaying data 
 * having experience more than 2 years and Job is Software Engineer using stream
 * 
 */

//SOLUTION :
@Log
public class TestEmployeePrgmEight {

	public static void main(String[] args) {

		Employee s1 = new Employee("Nistha", 4, 4,"Software Engineer");
		Employee s2 = new Employee("Rahul", 3, 2,"Clerk");
		Employee s3 = new Employee("Nikita", 2, 1,"QA");
		Employee s4 = new Employee("sakshi", 1, 5,"Tester");
		Employee s5 = new Employee("shruti", 5, 2,"Software Engineer");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		List<Employee> l = al.stream().filter(i->i.getExper()>2 && i.getJob()=="Software Engineer").collect(Collectors.toList());
		l.stream().forEach(e->log.info("Name is "+e.getName() + " " + "Experience is :" + e.getExper()+ " " + "Job is :" + e.getJob()));
		
		
	}//end of main

}//end of class
