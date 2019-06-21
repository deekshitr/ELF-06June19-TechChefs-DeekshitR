package com.techchefs.javaapp.javaBean2;
import java.util.Date;
import java.util.logging.Logger;

public class Example1 {
    public static final Logger log = Logger.getLogger("EmployeeBeanMainMethod");
	public static void main(String[] args) {
		
		Employee eBean1 = new Employee();
		log.info("Without lombok===>" + eBean1.toString());
		
		Employee eBean2 = new Employee();
		eBean2.setId(123);
		eBean2.setName("Ranjitha");
		eBean2.setDepartment("IT");
		eBean2.setAge(27);
		eBean2.setJoiningDate(new Date());
		eBean2.setGender("Male");
		eBean2.setSalary(20000);
		
		log.info("With lombok===>"+eBean2.toString());
	}

}
