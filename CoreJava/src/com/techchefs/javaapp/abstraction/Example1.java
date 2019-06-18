package com.techchefs.javaapp.abstraction;

public class Example1 {

	public static void main(String[] args) {
		Gmail g1 = new Gmail();
		Gdrive g2 = new Gdrive();
		Browser b1 = new Browser();
		b1.recieve(g1);
		b1.recieve(g2);

	}

}
