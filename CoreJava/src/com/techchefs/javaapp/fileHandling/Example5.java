package com.techchefs.javaapp.fileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("test1.txt");
			
			int i = fin.read();
			 System.out.println(i);
			while((i = fin.read())!=-1) {
				System.out.print((char)i);
			}
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
