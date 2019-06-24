package com.techchefs.javaapp.interface3;
public class Sbi implements AtmCard {

	@Override
	public void validate() {
		System.out.println("validate sbi");
	}

	@Override
	public void getInfo() {
		System.out.println("getinfo sbi");
	}

}
