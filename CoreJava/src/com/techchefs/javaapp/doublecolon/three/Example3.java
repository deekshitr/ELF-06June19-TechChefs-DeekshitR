package com.techchefs.javaapp.doublecolon.three;

import lombok.extern.java.Log;

@Log
public class Example3 {

	public static void main(String[] args) {
		MyStudent ms = new MyStudent();
		
		Average a = ms :: calculateAvg;
		a.avg(64, 45, 39);
		
		int mf=ms.myFactorial(5);
		
		log.info("factorial: "+ mf);
		

	}

}
