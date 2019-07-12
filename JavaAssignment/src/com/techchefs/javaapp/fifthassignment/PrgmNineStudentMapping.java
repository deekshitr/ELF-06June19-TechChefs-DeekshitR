package com.techchefs.javaapp.fifthassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmNineStudentMapping is a main method class to store the student's
 *  arraylist into a map and display them.
 */

//SOLUTION :
@Log
public class PrgmNineStudentMapping {
	
/*	It's a main method to call Students class 
 *  and display using map
 */
	public static void main(String[] args) {
		
		Students s1 = new Students("Nistha", 1,5, "Female", 79.6);
		Students s2 = new Students("ramesh", 2,5, "male", 89.4);
		Students s3 = new Students("Saurabh", 3,6, "male", 70.9);
		Students s4 = new Students("raman", 4,6, "male", 69.6);
		
		ArrayList<Students> al1 = new ArrayList<Students>();
		if(s1.studentclass == 5) {
			al1.add(new Students());
		}
		
		ArrayList<Students> al2 = new ArrayList<Students>();
		if(s1.studentclass == 6) {
			al2.add(new Students());
		}

		HashMap<Integer,ArrayList<Students>> m = new HashMap<Integer,ArrayList<Students>>();
		
		
		Iterator<Students> i = al1.iterator();
		
		while(i.hasNext()) {
			Students s = i.next();
			m.put(s.id, al1);
		}
		
		ArrayList<Students> bl = new ArrayList<Students>();
		bl.add(s1);
		bl.add(s2);
		bl.add(s3);
		bl.add(s4);
	
		for (Map.Entry<Integer, ArrayList<Students>> ma : m.entrySet()) {
			
			log.info("***************Details*****************");
			log.info("Key is :" + ma.getKey());
			log.info("value is :" + ma.getValue());
		} //End Of main
	}//End Of class

	
	
	
}
