package com.techchefs.javaapp.seventhassignment;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentOne is a main class storing Student data 
 * to compare the Student ID using Comparator lambda expression
 * 
 */

//SOLUTION :
@Log
public class TestProductTwo {
	
	public static void main(String[] args) {

		Product p1 = new Product("AC", 40000, 7.0);
		Product p2 = new Product("tv", 34000, 8.0);
		Product p3 = new Product("Pen", 2000, 5.7);
		Product p4 = new Product("Cooler", 16000, 7.9);
		Product p5 = new Product("Heatar", 5000, 5.6);

		Comparator<Product> c = (e, f) -> {

			Integer i1 = e.getCost();
			Integer i2 = f.getCost();

			return i1.compareTo(i2);
		};

		TreeSet<Product> ts = new TreeSet<Product>(c);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);

		for (Product p : ts) {

			log.info("Name is :" + p.getName());
			log.info("Cost is :" + p.getCost());
			log.info("Rating is :" + p.getRating());
			log.info("*******************************************");
		}
	}//end of main

}//end of class
