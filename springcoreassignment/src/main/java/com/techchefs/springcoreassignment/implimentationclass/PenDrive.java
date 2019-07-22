package com.techchefs.springcoreassignment.implimentationclass;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class PenDrive implements StorageDevice {
	
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;

	public void write() {
		log.info("Pendrive disk write");
	}

	public void read() {
		log.info("Pendrive write");
	}

	public void format() {
		log.info("Pendrive write");
	}

}
