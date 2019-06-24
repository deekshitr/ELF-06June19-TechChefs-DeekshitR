package com.techchefs.javaapp.interface2;
public class Mammal implements Animal, Human  {
	public void eat (){
		System.out.println("eat");
	}
	public void run () {
		System.out.println("run");
	}
}
