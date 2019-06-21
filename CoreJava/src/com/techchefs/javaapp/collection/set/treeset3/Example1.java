package com.techchefs.javaapp.collection.set.treeset3;

import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		TreeSet<Product> ts = new TreeSet<Product>();
		Product p1 = new Product();
		p1.name = "Television";
		p1.cost = 45345;
		p1.rating = 3.6;

		Product p2 = new Product();
		p2.name = "Washing Machine";
		p2.cost = 567746;
		p2.rating = 6.3;

		Product p3 = new Product();
		p3.name = "Computer";
		p3.cost = 45644;
		p3.rating = 4.2;

		Product p4 = new Product();
		p4.name = "Refrigirator";
		p4.cost = 56745;
		p4.rating = 8.1;

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		System.out.println("using foreach*************************************");

		for (Product p : ts) {
			System.out.println("product name : " + p.name);
			System.out.println("product cost : " + p.cost);
			System.out.println("product rating : " + p.rating);
			System.out.println("\n");
		}

	}

}
