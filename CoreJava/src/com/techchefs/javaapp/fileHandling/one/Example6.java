package com.techchefs.javaapp.filehandling.one;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Example6 {

	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("D://dee/test1.txt"), "This is JAVA file utiles!!!", Charset.defaultCharset());
			System.out.println("file created");
			
			String filestr = FileUtils.readFileToString(new File("D://dee/test1.txt"), Charset.defaultCharset());
			System.out.println("filestr : "+ filestr);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		

	}

}
