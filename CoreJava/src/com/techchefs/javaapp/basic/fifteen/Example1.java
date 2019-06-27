package com.techchefs.javaapp.basic.fifteen;

public class Example1 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Priya", 27, 5.4);
		Student s2 = new Student("Priya", 27, 5.4);
		
		System.out.println("s1 "+s1);
		
		System.out.println(s1.equals(s2));
		

	}

}
