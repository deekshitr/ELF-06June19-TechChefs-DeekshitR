package com.techchefs.springcore.exampleclass;

import com.techchefs.springcore.interfaces.Animal;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {
	public void eat() {
		log.info("Donkey eats grass");
	}
	
	public void makeSound() {
		log.info("Donkey makes sound");
	}
}
