package com.techchefs.javaapp.eighthassignment;
/* USE CASE :
 * Student is a class having Student data 
 * 
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//SOLUTION :
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
	private int id;
	private double percent;
	
}//end of class
