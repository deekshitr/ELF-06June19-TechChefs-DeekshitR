package com.techchefs.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.springcoreassignment.implimentationclass.HardDisk;
import com.techchefs.springcoreassignment.implimentationclass.PenDrive;

@Configuration
public class StorageDeviceConfig {
	
	@Bean(name="hardDisk")
	public HardDisk getHardDisk() {
		
		HardDisk hardDisk = new HardDisk();
		hardDisk.setCapacity(3);
		hardDisk.setReadingSpeed(4);
		hardDisk.setWritingSpeed(6);
		
		return hardDisk;
	}
	
	@Bean(name="penDrive")
	public PenDrive getPenDrive() {
		
		PenDrive penDrive = new PenDrive();
		penDrive.setCapacity(3);
		penDrive.setReadingSpeed(4);
		penDrive.setWritingSpeed(6);
		
		return penDrive;
	}
	 
}
