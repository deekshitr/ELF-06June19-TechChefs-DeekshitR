package com.techchefs.javaapp.filehandling.one;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) {
		String s = "hello friend, how are you?";
		char c[] = s.toCharArray();
		int i = 34;
		
		try {
			FileWriter fw = new FileWriter("test1.txt", true);
			fw.write(c);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
