package com.techchefs.javaapp.collection.set.treeset4;

public class Car implements Comparable<Car>{
	
	String name;
	String brand;
	int cost;
	double rating;
	
	
	  @Override public int compareTo(Car o) {
		  Double d1 = this.rating;
		  Double d2 = o.rating;
		  return d1.compareTo(d2) * -1; 
	  }
	 
	
	/*
	 * @Override public int compareTo(Car o) {
	 * 
	 * return this.name.compareTo(o.name); }
	 */
	
}
