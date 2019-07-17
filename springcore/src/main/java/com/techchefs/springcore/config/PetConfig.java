package com.techchefs.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.springcore.beans.PetBean;
import com.techchefs.springcore.exampleclass.Donkey;
import com.techchefs.springcore.exampleclass.Monkey;
import com.techchefs.springcore.interfaces.Animal;

@Configuration
public class PetConfig {
	
	@Bean
	public PetBean getPetBean() {
		return new PetBean();
	}
	
	@Bean(name="monkey")
	public Animal getMonkey() {
		return new Monkey();
	}
	
	@Bean(name="donkey")
	public Animal getDonkey() {
		return new Donkey();
	}
}
