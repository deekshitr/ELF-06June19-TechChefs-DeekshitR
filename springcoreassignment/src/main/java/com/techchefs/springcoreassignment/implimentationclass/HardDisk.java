package com.techchefs.springcoreassignment.implimentationclass;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class HardDisk implements StorageDevice {

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
