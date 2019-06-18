package com.techchefs.javaapp.fileHandling;
import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		File f = new File("D://test.txt");
		
		try {
			boolean result = f.createNewFile();
			System.out.println(result);
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
