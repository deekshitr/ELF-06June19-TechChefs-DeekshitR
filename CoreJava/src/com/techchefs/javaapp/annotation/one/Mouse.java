package com.techchefs.javaapp.annotation.one;

public class Mouse {
	
	void click() {
		System.out.println("click");
	}
	@Deprecated
	void scroll() {
		System.out.println("scroll");
	}
	void doubleClick() {
		System.out.println("doubleClick");
	}
	

}
