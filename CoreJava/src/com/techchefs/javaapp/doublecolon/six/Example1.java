package com.techchefs.javaapp.doublecolon.six;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		MyProduct mp = Product::new;
		Product p1 = mp.getProductDetails("Fan", 45646.43);
		log.info("Product: "+p1);
		
		Product p2 = mp.getProductDetails("AirConditioner", 56756.34);
		log.info("Product: "+p2);

	}

}
