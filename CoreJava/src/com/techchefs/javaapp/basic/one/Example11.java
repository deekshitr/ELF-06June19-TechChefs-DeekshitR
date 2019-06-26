package com.techchefs.javaapp.basic.one;

public class Example11 {

	public static void main(String[] args) {
		int ticketPrice = 1000;
		int retaireAge = 60;
		int personAge = 51;
		double discount = 15.2;
		double discountPrice = 0;
		if(personAge >= retaireAge) {
			discountPrice = (ticketPrice*discount)/100;
		}
		double payable = (ticketPrice-discountPrice);
		System.out.println("Pay : "+ payable);
		
	}

}
