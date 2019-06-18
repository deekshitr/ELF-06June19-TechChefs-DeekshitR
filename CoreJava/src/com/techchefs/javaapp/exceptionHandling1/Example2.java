package com.techchefs.javaapp.exceptionHandling1;

public class Example2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
			int ar[] = new int[5];
			System.out.println(ar[6]);
			
			String s = null;
			System.out.println(s.length());
			
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("Array IndexOut Of Bounds Exception");
		} catch (NullPointerException npe) {
			System.out.println("Null Pointer Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

}
