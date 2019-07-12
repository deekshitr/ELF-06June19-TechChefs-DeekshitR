package com.techchefs.javaapp.eighthassignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class StudentStreamTest {

		@Test
		public void testStudentLowerPercent() {		
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student("Nistha", 4, 77.0));
			al.add(new Student("Anjali", 3, 87.0));
			al.add(new Student("Nikita", 2, 79.7));
			al.add(new Student("sakshi", 1, 67.9));
			al.add(new Student("shruti", 5, 57.6));
			
			Student expect = new Student("shruti", 5, 57.6);
			Student actual = StudentStream.getLower(al);
			assertEquals(true, expect.equals(actual));
		}
		
		@Test
		public void testStudentToperPercent() {		
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student("Nistha", 4, 77.0));
			al.add(new Student("Anjali", 3, 87.0));
			al.add(new Student("Nikita", 2, 79.7));
			al.add(new Student("sakshi", 1, 67.9));
			al.add(new Student("shruti", 5, 57.6));
			
			Student expect = new Student("Anjali", 3, 87.0);
			Student actual = StudentStream.getTopper(al);
			assertEquals(true, expect.equals(actual));
		}
	}


