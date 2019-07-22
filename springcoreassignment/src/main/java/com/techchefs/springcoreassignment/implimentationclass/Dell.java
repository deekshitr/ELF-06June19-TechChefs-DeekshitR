package com.techchefs.springcoreassignment.implimentationclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.techchefs.springcoreassignment.interfaces.Laptop;
import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class Dell implements Laptop {
	
	private String brand;
	private String color;
	private float cost;
	private int weight;
	private int ram;
	private String os;
	
	@Autowired
	@Qualifier("hardDisk")
	private StorageDevice storageDevice;

	public void display() {
		log.info("Dell display");
	}

	public void process() {
		log.info("Dell process");
	}

	public void showSpecification() {
		
		Dell dell = new Dell();
		log.info("brand : "+dell.getBrand());
		log.info("color : "+dell.getColor());
		log.info("cost : "+dell.getCost());
		log.info("weight : "+dell.getWeight());
		log.info("ram : "+dell.getRam());
		log.info("os : "+dell.getOs());
		log.info("storageDevice : "+dell.getStorageDevice());
	}

}
