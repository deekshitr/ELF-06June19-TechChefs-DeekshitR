package com.techchefs.javaapp.javastatic.one;

public class Card {
	
	int count;
	static int orgCount;
	void count() {
		count++;
		orgCount++;
	}
}
