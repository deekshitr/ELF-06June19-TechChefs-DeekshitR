package com.techchefs.springcoreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springcoreassignment.config.LaptopConfig;
import com.techchefs.springcoreassignment.implimentationclass.Dell;
import com.techchefs.springcoreassignment.interfaces.Laptop;
import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class laptopTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LaptopConfig.class);

		Laptop dell = applicationContext.getBean(Dell.class);

		dell.display();
		dell.process();
		dell.showSpecification();

	}

}
