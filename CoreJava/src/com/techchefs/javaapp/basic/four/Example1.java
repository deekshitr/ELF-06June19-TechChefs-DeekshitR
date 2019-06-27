package com.techchefs.javaapp.basic.four;

public class Example1 {
	public static void main(String[] args) {
		
		Write w;
		w=new Write();
		
		
		Pen p = new Pen();
		w.getPen(p);
		p.recieve(w);
		
		
	}
}
