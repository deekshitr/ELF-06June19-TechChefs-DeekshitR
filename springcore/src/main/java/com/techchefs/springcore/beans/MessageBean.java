package com.techchefs.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;

@Log
public class MessageBean implements  InitializingBean, DisposableBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("Init phase");
		
	}
	
	@Override
	public void destroy() throws Exception {
		log.info("Destroy phase");
		
	}
	
	/*
	 * @PostConstruct public void init() { log.info("Init phase"); }
	 * 
	 * @PreDestroy public void destroy() { log.info("Destroy phase"); }
	 */
	
}
