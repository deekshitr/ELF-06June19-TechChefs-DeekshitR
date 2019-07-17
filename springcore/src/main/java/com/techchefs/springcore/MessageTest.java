package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.MessageBean;
import com.techchefs.springcore.config.MessageConfig;

import lombok.extern.java.Log;

@Log
public class MessageTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("beans.xml"); MessageBean messageBean =
		 * (MessageBean) applicationContext.getBean("messageBean");
		 * 
		 * log.info(messageBean.getMessage());
		 */
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		((ConfigurableApplicationContext)applicationContext).registerShutdownHook();
		
		MessageBean messageBean1 = applicationContext.getBean(MessageBean.class);
		MessageBean messageBean2 = applicationContext.getBean(MessageBean.class);
		
		log.info(messageBean1.getMessage());
		log.info(messageBean2.getMessage());
		
		messageBean2.setMessage("Welcome to Spring!!!");
		
		log.info(messageBean1.getMessage());
		log.info(messageBean2.getMessage());
		
		((ConfigurableApplicationContext)applicationContext).close();
	}
}
