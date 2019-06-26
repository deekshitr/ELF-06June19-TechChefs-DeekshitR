package com.techchefs.javaapp.lambda.two;

import java.util.Comparator;
import java.util.TreeSet;

public class ExampleA {

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

		Comparator<Employee> c1 = (e, f) -> {
			if (e.id > f.id) {
				return 1;
			} else if (e.id < f.id) {
				return -1;
			} else {
				return 0;
			}
		};

		Comparator<Employee> c2 = (e, f) -> e.name.compareTo(f.name);

		TreeSet<EmployeeById> ts1 = new TreeSet<EmployeeById>(c2);

		ts1.add((EmployeeById) e1);
		ts1.add((EmployeeById) e2);
		ts1.add((EmployeeById) e3);
		ts1.add((EmployeeById) e4);

		System.out.println("sort w.r.t id*************************************");

		for (EmployeeById e : ts1) {
			System.out.println("Employee name : " + e.name);
			System.out.println("Employee id : " + e.id);
			System.out.println("Employee salary : " + e.salary);
			System.out.println("\n");
		}

	}

}
