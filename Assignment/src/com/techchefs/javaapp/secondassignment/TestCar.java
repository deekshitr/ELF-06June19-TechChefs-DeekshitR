package com.techchefs.javaapp.secondassignment;

/* USE CASE :
 * TestCar is a test class of car class
 */

//SOLUTION :
public class TestCar {

	public static void main(String[] args) {
		Driver d = new Driver();
		Benz b = new Benz();
		Audi a = new Audi();

		d.drive(a);

	}//end of main

}//end of class
