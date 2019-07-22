package com.techchefs.springcoreassignment.implimentationclass;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class HardDisk implements StorageDevice {
	
	private int capacity;
	private int writingSpeed;
	private int readingSpeed;

	public void write() {
		log.info("Hard disk write");
	}

	public void read() {
		log.info("Hard disk read");
	}

	public void format() {
		log.info("Hard disk format");
	}

}
