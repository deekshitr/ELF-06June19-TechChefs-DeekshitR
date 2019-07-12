package com.techchefs.javaapp.fifthassignment;

import java.util.Comparator;

/* USE CASE :
 * PrgmSixSortByID is a class to compare the employees
 *  by their IDs
 */

//SOLUTION :

public class PrgmSixSortByID implements Comparator<EmployeeBean>{

	@Override
	public int compare(EmployeeBean o1, EmployeeBean o2) {
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		return id1.compareTo(id2);
	}
	
	

} //end of class
