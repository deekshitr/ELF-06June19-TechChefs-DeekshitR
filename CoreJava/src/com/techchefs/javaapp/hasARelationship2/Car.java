package com.techchefs.javaapp.hasARelationship2;

public class Car {
	int model = 2016;
	final static MusicSystem m = new MusicSystem();
	Seat s=new Seat();
	void drive() {
		System.out.println("drive car");
	}
	void horn() {
		System.out.println("horn car");
	}
}
