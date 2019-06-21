package com.techchefs.javaapp.arrays2;

public class MyArrayClass {

	private Object[] myArray;
	private int index;
	private static int initialSize = 10;

	MyArrayClass() {
		this(initialSize);
	}

	MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero !!!");
		}
		myArray = new Object[size];
		index = 0;
	}
	
	
	public void add(Object val) {
		if (index >= myArray.length) {
			Object[] myArrayNew = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, myArrayNew, 0, myArray.length);
			myArray = myArrayNew;
		} 
		
		myArray[index] = val;
		index++;
		
	}

	public void remove(int position) {

//		for (int i=position;i<myArray.length-1;i++) {
//			myArray[i] = myArray[i+1];
//		}
		
		if (position >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException("Position should be within the array !!!");
		}

		System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
		myArray[myArray.length - 1] = null;
		
	}

	public Object get(int position) {
		return myArray[position];
	}
	
	public int getSize() {
		return index-1;
	}


}
