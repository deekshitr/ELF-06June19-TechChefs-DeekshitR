package com.techchefs.javaapp.collection.set.treeset5;

import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		Employee e1 = new EmployeeById();
		e1.name = "Rakesh";
		e1.id = 103;
		e1.salary = 45645.54;

		Employee e2 = new EmployeeById();
		e2.name = "Eshwar";
		e2.id = 102;
		e2.salary = 567567.33;

		Employee e3 = new EmployeeById();
		e3.name = "Umesh";
		e3.id = 101;
		e3.salary = 67567.768;

		Employee e4 = new EmployeeById();
		e4.name = "Trisha";
		e4.id = 104;
		e4.salary = 5745.34;
		
		EmployeeById emp1 = new EmployeeById();
		TreeSet<EmployeeById> ts1 = new TreeSet<EmployeeById>(emp1);

		ts1.add((EmployeeById) e1);
		ts1.add((EmployeeById) e2);
		ts1.add((EmployeeById) e3);
		ts1.add((EmployeeById) e4);
		
		EmployeeByName emp2 = new EmployeeByName();
		TreeSet<EmployeeById> ts2 = new TreeSet<EmployeeById>(emp2);

		ts2.add((EmployeeById) e1);
		ts2.add((EmployeeById) e2);
		ts2.add((EmployeeById) e3);
		ts2.add((EmployeeById) e4);
		
		
		
		System.out.println("sort w.r.t id*************************************");

		for (EmployeeById e : ts1) {
			System.out.println("Employee name : " + e.name);
			System.out.println("Employee cost : " + e.id);
			System.out.println("Employee rating : " + e.salary);
			System.out.println("\n");
		}
		
		System.out.println("sort w.r.t name*************************************");

		for (EmployeeById e : ts2) {
			System.out.println("Employee name : " + e.name);
			System.out.println("Employee cost : " + e.id);
			System.out.println("Employee rating : " + e.salary);
			System.out.println("\n");
		}

	}

}
