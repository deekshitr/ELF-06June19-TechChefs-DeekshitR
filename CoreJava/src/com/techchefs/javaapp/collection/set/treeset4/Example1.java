package com.techchefs.javaapp.collection.set.treeset4;

import java.util.TreeSet;


public class Example1 {

	public static void main(String[] args) {
		TreeSet<Car> ts = new TreeSet<Car>();
		Car p1 = new Car();
		p1.name = "Santro";
		p1.cost = 45345;
		p1.rating = 3.6;
		p1.brand = "Hyundai";

		Car p2 = new Car();
		p2.name = "Figo";
		p2.cost = 567746;
		p2.rating = 6.3;
		p2.brand = "Maruthi";

		Car p3 = new Car();
		p3.name = "Laura";
		p3.cost = 45644;
		p3.rating = 4.2;
		p3.brand = "Skoda";

		Car p4 = new Car();
		p4.name = "S100";
		p4.cost = 56745;
		p4.rating = 8.1;
		p4.brand = "Mercedis Benz";

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println("using foreach*************************************");

		for (Car p : ts) {
			System.out.println("Car name : " + p.name);
			System.out.println("Car cost : " + p.cost);
			System.out.println("Car rating : " + p.rating);
			System.out.println("Car brand : " + p.brand);
			System.out.println("\n");
		}


	}

}
