package com.techchefs.javaapp.fifthassignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* USE CASE :
 * 
 * It is a Bean class Of student
 */

//SOLUTION :
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBean {

	private String name;
	private int id;
	private String gender;
	private double percent;
}//End Of class
