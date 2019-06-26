package com.techchefs.javaapp.javainterface.three;
public class Example1 {

	public static void main(String[] args) {
		Icici i = new Icici();
		Hdfc h = new Hdfc();
		Sbi s = new Sbi();
		Machine a1 = new Machine();
		a1.slot(i);
		a1.slot(h);
		a1.slot(s);

	}

}
