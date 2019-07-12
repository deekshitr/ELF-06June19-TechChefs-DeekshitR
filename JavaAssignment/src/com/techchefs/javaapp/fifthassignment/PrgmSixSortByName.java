package com.techchefs.javaapp.fifthassignment;

import java.util.Comparator;

/* USE CASE :
 * PrgmSixSortByID is a class to compare the employees
 *  by their names
 */

//SOLUTION :

public class PrgmSixSortByName implements Comparator<EmployeeBean>{

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

} //end of class
