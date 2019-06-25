package com.techchefs.javaapp.doublecolon6;

public class Product {
	String name;
	double cost;
	public Product(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + "]";
	}
	
}
