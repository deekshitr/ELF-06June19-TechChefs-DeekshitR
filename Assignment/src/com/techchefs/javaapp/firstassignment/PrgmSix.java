package com.techchefs.javaapp.firstassignment;

/* USE CASE :
 * PrgmSix is a main test class 
 * to check the prime number
 */

//SOLUTION :
import java.util.Scanner;

public class PrgmSix {

	public static void main(String[] args) {

		int n;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		n = num;

		for (int i = 2; i <= n / 2; i++) {
			int temp = n % i;

			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}

	}

}
