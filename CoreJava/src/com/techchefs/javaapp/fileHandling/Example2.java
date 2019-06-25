package com.techchefs.javaapp.filehandling;
import java.io.File;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		File f1 = new File("movies/kannada/new");
		boolean result = f1.mkdirs();
		
		try {
			File f2 = new File("movies/kannada/new/test.txt");
			f2.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
	}
}
