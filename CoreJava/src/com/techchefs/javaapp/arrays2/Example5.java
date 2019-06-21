package com.techchefs.javaapp.arrays2;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setAge(26);
		e1.setName("Rina");
		e1.setSalary(20000);
		
		Employee e2 = new Employee();
		e2.setAge(24);
		e2.setName("Deepak");
		e2.setSalary(50000);
		
		Employee e3 = new Employee();
		e3.setAge(23);
		e3.setName("Tarun");
		e3.setSalary(30000);
		
		Employee e4 = new Employee();
		e4.setAge(22);
		e4.setName("Umesh");
		e4.setSalary(10000);
		
		Employee[] emp = {e1,e2,e3,e4};
		
		Arrays.sort(emp);
		
		for(Employee empArr:emp) {
			System.out.println("Age "+empArr.getAge());
			System.out.println("Name "+empArr.getName());
			System.out.println("Salary "+empArr.getSalary());
		}

	}

}
