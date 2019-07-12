package com.techchefs.javaapp.seventhassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * TestEmployeePrgmNine is a main class storing Employee data 
 * and display using For each and stream
 * 
 */

//SOLUTION :

@Log
public class TestEmployeePrgmNine {
	
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
		
al.stream().forEach(i->log.info("Employee Id are :" + i.getEmpId()));
log.info("************************************************************");
al.stream().forEach(i->log.info("Employee Name are :" + i.getName()));
log.info("************************************************************");
al.stream().forEach(i->log.info("Employee Jobs are :" + i.getJob()));
		
		
		
	}//end of main

}//end of class



