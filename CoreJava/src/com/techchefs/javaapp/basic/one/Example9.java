package com.techchefs.javaapp.basic.one;

public class Example9 {

	public static void main(String[] args) {
		int count = 0;
		int item = 1000;
		int discount = 10;
		double discountPrice = 0;
		
		if(count == 0) {
			discountPrice = ((item)*discount)/100;
			System.out.println(item+" Discount of 10%");
		}
		double payable = item-discountPrice;
		System.out.println("Pay :" + payable);
	}

}
