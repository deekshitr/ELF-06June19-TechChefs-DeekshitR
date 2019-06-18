package com.techchefs.javaapp.casting2;

public class Example1 {
	
	public static void main(String[] args) {
		Chips c1 = new Lays();
		
		Lays l = (Lays)c1;
		l.open();
		l.eat();
		
		Chips c2 = new Bingo();
		Bingo b = (Bingo)c2;
		b.open();
		b.eat();
		
	}

}
