package com.techchefs.javaapp.fifthassignment;

import lombok.Data;
import lombok.NoArgsConstructor;

/* USE CASE :
 * Employee is a Bean class having employee's details
 *  
 */

//SOLUTION :
@Data
@NoArgsConstructor
public class EmployeeBean {
	
	private int id;
	private String name;
	private String department;
	private double salary;

}//End Of class
