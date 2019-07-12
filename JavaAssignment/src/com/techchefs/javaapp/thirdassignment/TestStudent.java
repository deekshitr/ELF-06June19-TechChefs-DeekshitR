package com.techchefs.javaapp.thirdassignment;

/* USE CASE :
 * String4 is a main test class 
 * to print the student details
 */

//SOLUTION :
public class TestStudent {
	
	static String[] names = { "Nistha", "Rishi", "niharika" ,"Abha"};
	static int[] ages = {20 ,21 ,22, 23};
	public static void main(String[] args) {

		ArrayStore a = new ArrayStore();
		Student[] s = new Student[names.length];
		Student[] s1 = new Student[ages.length];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].setName(names[i]);
			s[i].setAge(ages[i]);
			
		}
		
		a.store(s);
		
	}//end of main

}//end of class
