package com.techchefs.javaapp.javaassessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class ListTestPrgmThree {
	
	public static void main(String[] args) {
		
		log.info("Enter the number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		ListObjectPrgmThree.getList(x);
	}

}
