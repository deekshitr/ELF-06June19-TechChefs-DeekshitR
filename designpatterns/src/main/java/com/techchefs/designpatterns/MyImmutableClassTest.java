package com.techchefs.designpatterns;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;
		
		immutableClass = new MyImmutableClass("Myna", 25, 9966778855L);
		log.info("Name: "+immutableClass.getName());
		log.info("Age: "+immutableClass.getAge());
		log.info("Phone: "+immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("Raghu", 28, 9966338855L);
		log.info("Name: "+immutableClass.getName());
		log.info("Age: "+immutableClass.getAge());
		log.info("Phone: "+immutableClass.getPhone());
		
		
	}
}
