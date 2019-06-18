package com.techchefs.javaapp.exceptionHandling1;
import java.io.File;
import java.io.IOException;

public class Example3 {
	
	public static void main(String[] args) {
		System.out.println("main started");
		File f = new File("test.txt");
		
		try {
			f.createNewFile();
		} catch (IOException io) {
			System.out.println("IO Exception");
		}
		
		System.out.println("main ended");
	}
}
