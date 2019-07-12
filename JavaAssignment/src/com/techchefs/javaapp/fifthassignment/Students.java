package com.techchefs.javaapp.fifthassignment;

import lombok.AllArgsConstructor;
import lombok.Data;

/* USE CASE :
 * Employee is a class having student's details
 *  
 */

//SOLUTION :
@Data
@AllArgsConstructor
public class Students {
	
	public Students() {
	}
	String name;
	int id;
	int studentclass;
	String gender;
	double percent;

}//end of class
