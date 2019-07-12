package com.techchefs.javaapp.javaassessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.techchefs.javaapp.javaassessment.StudentPrgmSix;

import lombok.extern.java.Log;

/* USE CASE :
 * StudentStreamPrgmSix is a Bean main class 
 *have arraylist filtered for male and female Topper using stream and Comparator
 * 
 */
@Log
public class StudentStreamPrgmSix {

	static Comparator<StudentPrgmSix> comp = (i, j) -> {
		Double per1 = i.getPercent();
		Double per2 = j.getPercent();
		int resultper = 0;

		return per1.compareTo(per2)	;	

	};

	private static StudentPrgmSix getFemaleTopper(ArrayList<StudentPrgmSix> studentlist) {

		List<StudentPrgmSix> lst = studentlist.stream().filter(f->f.getGender()=="Female").collect(Collectors.toList());
		
		return lst.stream().max(comp).get();
	}

	private static StudentPrgmSix getMaleTopper(ArrayList<StudentPrgmSix> studentlist) {

List<StudentPrgmSix> lst = studentlist.stream().filter(f->f.getGender()=="Male").collect(Collectors.toList());
		
		return lst.stream().max(comp).get();

	}

	public static void main(String[] args) {
		
		ArrayList<StudentPrgmSix> studentArralist = new ArrayList<StudentPrgmSix>();

		studentArralist.add(new StudentPrgmSix("Nistha", 4,"Female", 77.0));
		studentArralist.add(new StudentPrgmSix("Neha", 4,"Female", 77.0));
		studentArralist.add(new StudentPrgmSix("Rohit", 2,"Male", 79.7));
		studentArralist.add(new StudentPrgmSix("Rahul", 1,"Male", 67.9));
		studentArralist.add(new StudentPrgmSix("shruti", 5,"Female", 57.6));
		
		StudentPrgmSix studentPrgmSix = getFemaleTopper(studentArralist);
		StudentPrgmSix studentPrgmSix2 = getMaleTopper(studentArralist);
		
		log.info("Name is :" + studentPrgmSix.getName() + " with " + "Female Maximum percentage is :" + studentPrgmSix.getPercent());
		log.info("***********************************************************************");
		log.info("Name is :" + studentPrgmSix2.getName() + " with " + "Male Minimum percentage is :" + studentPrgmSix2.getPercent());
	}// End of main
}// End of class
