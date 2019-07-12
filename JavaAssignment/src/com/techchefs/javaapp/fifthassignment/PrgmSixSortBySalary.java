package com.techchefs.javaapp.fifthassignment;

import java.util.Comparator;

/* USE CASE :
 * PrgmSixSortByID is a class to compare the employees
 *  by their salaries
 */

//SOLUTION :
public class PrgmSixSortBySalary implements Comparator<EmployeeBean>{

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		Double s1 = o1.getSalary();
		Double s2 = o2.getSalary();
		return s1.compareTo(s2);
	}

}//end of class
