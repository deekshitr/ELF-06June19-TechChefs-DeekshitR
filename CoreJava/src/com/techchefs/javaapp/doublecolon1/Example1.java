package com.techchefs.javaapp.doublecolon1;

import lombok.extern.java.Log;

@Log
public class Example1 {
	static void open() {
		log.info("*****************open method************");
		log.info("logic to open the door");
	}
	public static void main(String[] args) {
		
		Room r = Example1 :: open;
		r.remove();
	}

}
