package com.techchefs.springcoreassignment.implimentationclass;

import com.techchefs.springcoreassignment.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Log
public class PenDrive implements StorageDevice {

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
