package com.techchefs.javaapp.javaBean.one;
import java.util.Date;

public class Example1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(123);
		e1.setName("Ranjitha");
		e1.setDepartment("IT");
		e1.setAge(27);
		e1.setJoiningDate(new Date());
		e1.setGender("Male");
		e1.setSalary(20000);
	}

}
