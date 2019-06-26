package com.techchefs.javaapp.filehandling.two;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleA {

	public static void main(String[] args) {
		
		String msg = "message";
		byte[] by = msg.getBytes();
				
		try (FileOutputStream fout = new FileOutputStream("test.txt")) {
			fout.write(by);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
