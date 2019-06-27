package com.techchefs.javaapp.basic.eleven;

public class Example1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setAge(28);
		e1.setGender('M');
		e1.setName("Rakesh");
		
		DB1 d1 = new DB1();
		d1.recieve(e1);
		
		Employee e2 = new Employee();
		
		e2.setAge(30);
		e2.setGender('F');
		e2.setName("Roshan");
		
		DB2 d2 = new DB2();
		d2.recieve(e2);

	}

}
