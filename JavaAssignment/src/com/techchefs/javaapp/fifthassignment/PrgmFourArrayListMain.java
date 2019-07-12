package com.techchefs.javaapp.fifthassignment;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmFourArrayListMain is a main method class to store the Employee
 *  class object in an arraylist.
 */

//SOLUTION :
@Log
public class PrgmFourArrayListMain {
	
	/*	It's a main method to call Employee class 
	 *  and display using arraylist
	 */
	public static void main(String[] args) {
		
		Employee p1 = new Employee(1, "Nistha", "Science", 20000);
		Employee p2 = new Employee(2, "Shiv", "Computer", 25000);
		Employee p3 = new Employee(3, "Ritu", "History", 18000);
		Employee p4 = new Employee(4, "Abha", "English", 30000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		Iterator<Employee> i = al.iterator();
		
		while(i.hasNext()) {
			
			Employee e = i.next();
			log.info("******************Employee details*************");
			log.info("id is " + e.id);
			log.info("name is " + e.name);
			log.info("Department is " + e.department);
			log.info("salary is " + e.salary);
		}
	}
	
	

}
