package com.techchefs.springcore.exampleclass;

import com.techchefs.springcore.interfaces.Animal;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {
	
	public void eat() {
		log.info("Mokey eats banana");
	}
	
	public void makeSound() {
		log.info("Monkey makes sound");
	}
}
