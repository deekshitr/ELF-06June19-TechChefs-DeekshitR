package com.techchefs.javaapp.seventhassignment;

/* USE CASE :
 * Product is a bean class having Student data 
 * 
 */

//SOLUTION :
public class Product {
	
	private String name;
	private int cost;
	private double rating;
	
	public Product(String name, int cost, double rating) {
		super();
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
	public double getRating() {
		return rating;
	}
	
	
}//end of class
