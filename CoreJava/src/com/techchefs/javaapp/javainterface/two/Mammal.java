package com.techchefs.javaapp.javainterface.two;
public class Mammal implements Animal, Human  {
	public void eat (){
		System.out.println("eat");
	}
	public void run () {
		System.out.println("run");
	}
}
