package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.PetBean;
import com.techchefs.springcore.config.PetConfig;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext applicationContext = new
		 * AnnotationConfigApplicationContext(PetConfig.class);
		 * 
		 * PetBean petBean = applicationContext.getBean(PetBean.class);
		 */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("petConfig.xml");
		
		PetBean petBean = (PetBean) applicationContext.getBean("petBean");
				
		petBean.doSomething();
		
	}

}
