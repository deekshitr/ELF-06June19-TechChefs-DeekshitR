package com.techchefs.javaapp.fourthassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

/* USE CASE :
 * prgm2File2 is a main test class 
 * to create a file and write into it
 */

//SOLUTION :
@Log
public class PrgmTwoReadAndWriteData {

	public static void main(String[] args) {
		
		String msg = "Hellooo, Good Morning";
		int i;
		byte b[] = msg.getBytes();
		FileOutputStream fout = null;
		FileInputStream fit = null;
		
		try {
			fit = new FileInputStream("Prgm2File1.txt");
			fout = new FileOutputStream("fileappend.txt" , true);
			
			while((i=fit.read()) != -1) {
				fout.write(i);
			}
			log.info("Data is append into the file2");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fit.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}// end of main
}// end of class
