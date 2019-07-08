package com.techchefs.designpatterns.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws Exception {
		MyImmutableClass immutableClass = null;
		
		immutableClass = new MyImmutableClass("Myna", 25, 9966778855L);
		log.info("Name: "+immutableClass.getName());
		log.info("Age: "+immutableClass.getAge());
		log.info("Phone: "+immutableClass.getPhone());
		
		immutableClass = new MyImmutableClass("Raghu", 28, 9966338855L);
		log.info("Name: "+immutableClass.getName());
		log.info("Age: "+immutableClass.getAge());
		log.info("Phone: "+immutableClass.getPhone());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date joiningDate = format.parse("2018-02-20");
		Date dob = format.parse("1970-02-20");
		EmployeeData data1 = new EmployeeData(9, "Myna", 40, "F", 41000, 9922883399L,
							joiningDate, 2299552299L, "h@gmail.com", "Tester",
							dob, 1, 2);
		
		log.info("Employee data: "+data1.toString());
		
		EmployeeData2 data2 = new EmployeeData2
						.EmployeeData2Builder()
						.id(10)
						.name("Shreya")
						.age(29)
						.gender("F")
						.salary(22000)
						.phone(9922883366L)
						.joiningDate(joiningDate)
						.accNum(1199337755L)
						.email("g@gmail.com")
						.designation("Tester")
						.dob(dob)
						.departmentId(1)
						.managerId(1)
						.build();
		
		log.info("employee data 2 : "+data2.toString());
		
		EmployeeData3 data3 = new EmployeeData3
				.EmployeeData3Builder()
				.id(11)
				.name("Priya")
				.age(29)
				.gender("F")
				.salary(34000)
				.phone(9922385366L)
				.joiningDate(joiningDate)
				.accNum(1199337755L)
				.email("h@gmail.com")
				.designation("Tester")
				.dob(dob)
				.departmentId(1)
				.managerId(1)
				.build();

		log.info("employee data 3 : "+data3.toString());
		
	}
}
