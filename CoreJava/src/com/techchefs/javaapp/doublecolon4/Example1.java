package com.techchefs.javaapp.doublecolon4;

public class Example1 {

	public static void main(String[] args) {
		
		PenFactory pf = Pen::new;
		
		Pen p = pf.getPen();

	}

}
