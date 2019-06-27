package com.techchefs.javaapp.basic.five;

public class Example1 {

	public static void main(String[] args) {
		
		Baby b = new Baby();
		Lays l = new Lays();
		Kurkure k = new Kurkure();
		
		b.recieve(l);
		b.recieve(k);

	}

}
