package com.techchefs.javaapp.eighthassignment;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

/* USE CASE :
 * EmployeeLowestSalaryPrgmTwo is a main class storing Employee data 
 * to filter the minimum salary using Stream 
 * 
 */

//SOLUTION :
@Log
public class EmployeeLowestSalaryPrgmTwo {

public static void main(String[] args) {
		
		Employee s1 = new Employee("Nistha", 4, 40000,"Software Engineer");
		Employee s2 = new Employee("Rahul", 3, 20000,"Clerk");
		Employee s3 = new Employee("Nikita", 2, 13000,"QA");
		Employee s4 = new Employee("sakshi", 1, 5000,"Tester");
		Employee s5 = new Employee("shruti", 5, 21000,"Software Engineer");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Comparator<Employee> c = (i,j)->{
			
			Integer sal1 = i.getSalary();
			Integer sal2 = j.getSalary();
			
			return sal1.compareTo(sal2);
		};
		
		Employee minSalary = al.stream().min(c).get();
		
		log.info("Student :" + " " + minSalary.getName() + " " + "with having minimum salary :" + minSalary.getSalary());

	}// end of main
	
}// end of main

