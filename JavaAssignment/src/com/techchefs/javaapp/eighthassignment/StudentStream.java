package com.techchefs.javaapp.eighthassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Logger;

/* USE CASE :
 * TestStudentOne is a main class storing Student data 
 * to compare the Student percentage using Comparator lambda expression
 * 
 */

//SOLUTION :
public class StudentStream {
	
	static Comparator<Student> c = (i, j) -> {
		Double p1 = i.getPercent();
		Double p2 = j.getPercent();
		return p1.compareTo(p2);

	};

	static Student getTopper(ArrayList<Student> al) {
		return al.stream().max(c).get();
	}

	static Student getLower(ArrayList<Student> al) {
		return al.stream().min(c).get();
	}

	public static void main(String[] args) {
		Logger log = Logger.getLogger("StudentTest.txt");
		
		ArrayList<Student> al = new ArrayList<Student>();

		al.add(new Student("Nistha", 4, 77.0));
		al.add(new Student("Nistha", 4, 77.0));
		al.add(new Student("Nikita", 2, 79.7));
		al.add(new Student("sakshi", 1, 67.9));
		al.add(new Student("shruti", 5, 57.6));

		Student per = getTopper(al);
		Student per1 = getLower(al);

		log.info("Name is :" + per.getName() + " with " + "Maximum percentage is :" + per.getPercent());
		log.info("***********************************************************************");
		log.info("Name is :" + per1.getName() + " with " + "Minimum percentage is :" + per1.getPercent());
	}// End of main
}// End of class
