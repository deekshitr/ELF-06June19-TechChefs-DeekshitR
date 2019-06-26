package com.techchefs.javaapp.factoryMethod.one;

import java.util.function.Supplier;

import lombok.extern.java.Log;
@Log
public class Example1 {

	public static void main(String[] args) {
		
		Supplier<Gun> s1 = ()->new Gun(100);
		Gun g = s1.get();
		log.info("gun bullets: "+ g.bullets);
		
		Supplier<Car> s2 = ()->new Car(15.3);
		Car c = s2.get();
		log.info("Car fuel: "+c.fuelQty);

	}

}
