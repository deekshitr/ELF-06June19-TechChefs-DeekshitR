package com.techchefs.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.techchefs.springcoreassignment.implimentationclass.Dell;
import com.techchefs.springcoreassignment.implimentationclass.HP;

@Configuration
@Import(StorageDeviceConfig.class)
public class LaptopConfig {
	
	@Bean
	public Dell getDell() {
		Dell dell = new Dell();
		dell.setBrand("wefwe");
		dell.setColor("blue");
		dell.setCost(23523);
		dell.setOs("Windows");
		dell.setRam(4);
		dell.setWeight(344);
		
		return dell;
		
	}
	
	@Bean
	 public HP getHP() {
		 
		HP hp = new HP();
		hp.setBrand("trtj");
		hp.setColor("red");
		hp.setCost(56734);
		hp.setOs("Ubuntu");
		hp.setRam(8);
		hp.setWeight(452);
		
		return hp;
	 }
	
	

}
