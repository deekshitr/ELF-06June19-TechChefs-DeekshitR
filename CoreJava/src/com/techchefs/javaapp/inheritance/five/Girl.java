package com.techchefs.javaapp.inheritance.five;

public class Girl {
	void recieve(Phone p) {
		if (p instanceof MiPhone) {
			System.out.println("Thank you brother");
		} else if (p instanceof IPhone) {
			System.out.println("i love you");
		}
	}
}