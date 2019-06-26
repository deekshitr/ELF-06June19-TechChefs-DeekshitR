package com.techchefs.javaapp.scanner.one;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name = s.nextLine();
		System.out.println("name "+name);
		s.close();
	}

}
