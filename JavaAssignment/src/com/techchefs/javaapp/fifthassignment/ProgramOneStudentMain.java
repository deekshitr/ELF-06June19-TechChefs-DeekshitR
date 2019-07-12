package com.techchefs.javaapp.fifthassignment;

import java.util.ArrayList;

import lombok.extern.java.Log;

/* USE CASE :
 * ProgramOneStudentMain is a main test class 
 * to store the bean class object into tha arraylist
 */

//SOLUTION :
@Log
public class ProgramOneStudentMain {
	
	/*	It's a main method to call Students bean class 
	 *  and display using arraylist
	 */

	public static void main(String[] args) {
		
		ArrayList<StudentBean> al = new ArrayList<StudentBean>();
		
		StudentBean s1 = new StudentBean();
		s1.setId(1);
		s1.setName("Nistha");
		s1.setGender("Female");
		s1.setPercent(88.9);
		
		StudentBean s2 = new StudentBean();
		s2.setId(2);
		s2.setName("Rahul");
		s2.setGender("male");
		s2.setPercent(78.9);
		
		StudentBean s3 = new StudentBean();
		s3.setId(3);
		s3.setName("Shruti");
		s3.setGender("Female");
		s3.setPercent(80.9);
		
		StudentBean s4 = new StudentBean();
		s4.setId(4);
		s4.setName("Raman");
		s4.setGender("male");
		s4.setPercent(60.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		for (StudentBean s : al) {
			log.info("******************Student details*************");
			log.info("Student ID :" + s.getId());
			log.info("Student Name :" + s.getName());
			log.info("Student Gender :" + s.getGender());
			log.info("Student Percent :" + s.getPercent());
		}
	}//End Of main
}//End Of class
