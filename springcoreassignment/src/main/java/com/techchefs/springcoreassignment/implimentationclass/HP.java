package com.techchefs.springcoreassignment.implimentationclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.techchefs.springcoreassignment.interfaces.Laptop;
import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class HP implements Laptop{
	
	private String brand;
	private String color;
	private float cost;
	private int weight;
	private int ram;
	private String os;
	
	@Autowired
	@Qualifier("penDrive")
	private StorageDevice storageDevice;
	

	public void display() {
		log.info("HP display");
	}

	public void process() {
		log.info("HP process");
	}

	public void showSpecification() {
		log.info("brand : "+brand);
		log.info("color : "+color);
		log.info("cost : "+cost);
		log.info("weight : "+weight);
		log.info("ram : "+ram);
		log.info("os : "+os);
	}
	
}
