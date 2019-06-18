package com.techchefs.javaapp.fileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) {
		
		String s = " How i wonder what you are";
		byte b[] = s.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("poem.txt", true);
			fout.write(b);
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}
