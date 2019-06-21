package com.techchefs.javaapp.collection.set.treeset3;

public class Product implements Comparable<Product> {
	
	String name;
	int cost;
	double rating;
	
	@Override
	public int compareTo(Product o) {
		if (this.rating < o.rating) {
			return 1;
		} else if (this.rating > o.rating) {
			return -1;
		} else {
			return 0;
		}
	}

}
