package com.techchefs.javaapp.hasarelationship.two;

public class Example1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.m.play();
		c1.m.pause();
		c1.m.brand= "Sony";
		c1.drive();
		c1.horn();
		c1.model = 2018;
		Car.m.brand= "dfwef";
		Car.m.play();
		Seat s1 = new Seat();
		s1.bend();
	}
}
