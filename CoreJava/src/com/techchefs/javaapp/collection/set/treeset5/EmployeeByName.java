package com.techchefs.javaapp.collection.set.treeset5;

import java.util.Comparator;

public class EmployeeByName implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
		
	}
}
