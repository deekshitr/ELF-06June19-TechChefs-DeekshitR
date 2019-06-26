package com.techchefs.javaapp.javastatic.one;
public class Example1 {

	public static void main(String[] args) {
		Card j = new Card();
		Card a = new Card();
		j.count();
		a.count();
		j.count();
		System.out.println("Organization count "+Card.orgCount+" where java has "+j.count  +" and angular has "+ a.count);

	}

}
