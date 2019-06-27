package com.techchefs.javaapp.basic.ten;

public class Example1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(26);
		p1.setName("Naveen");
		
		DB1 d1 = new DB1();
		d1.recieve(p1);
		
		Person p2 = new Person();
		p2.setAge(28);
		p2.setName("Dilip");
		
		DB2 d2 = new DB2();
		d2.recieve(p2);
	}

}
