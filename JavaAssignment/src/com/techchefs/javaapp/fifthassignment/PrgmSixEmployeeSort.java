package com.techchefs.javaapp.fifthassignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmSixEmployeeSort is a main test class to sort the employees
 *  using switch case
 */

//SOLUTION :
@Log
public class PrgmSixEmployeeSort {
	
	/*	It's a main method to call employee bean class
	 *  and sort the employees
	 */
	public static void main(String[] args) {
		
		log.info("Enter the choice :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		EmployeeBean e1 = new EmployeeBean();
		e1.setId(1);
		e1.setName("Nistha");
		e1.setDepartment("History");
		e1.setSalary(30000);
		
		EmployeeBean e2 = new EmployeeBean();
		e2.setId(2);
		e2.setName("Rahul");
		e2.setDepartment("Science");
		e2.setSalary(20000);
		
		EmployeeBean e3 = new EmployeeBean();
		e3.setId(3);
		e3.setName("Shreya");
		e3.setDepartment("Computer");
		e3.setSalary(45000);
		
		EmployeeBean e4 = new EmployeeBean();
		e4.setId(4);
		e4.setName("Dhaval");
		e4.setDepartment("Hindi");
		e4.setSalary(18000);
		
		TreeSet<EmployeeBean> ts = null;
		
		switch (num) {
		case 1: 
			PrgmSixSortByID p1 = new PrgmSixSortByID();
			
			ts = new TreeSet<EmployeeBean>(p1);
				
			break;
			
		case 2:
			
			PrgmSixSortByName p2 = new PrgmSixSortByName();
			
			ts = new TreeSet<EmployeeBean>(p2);
			
			break;
			
		case 3:
			
			PrgmSixSortBySalary p3 = new PrgmSixSortBySalary();
			
			ts = new TreeSet<EmployeeBean>(p3);
	
			break;

		default:
			
			log.info("Enter the correct choice");
			break;
		}
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		Iterator<EmployeeBean> i = ts.iterator();
		
		while(i.hasNext()) {
			EmployeeBean p = i.next();
			
			log.info("******************Employee details*************");
			log.info("Id is " + p.getId());
			log.info("name is " + p.getName());
			log.info("department is " + p.getDepartment());
			log.info("salary is " + p.getSalary());
		}
		
		
	}//end of main
	

}//end of class
