package com.techchefs.javaapp.javaassessment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class ListObjectPrgmThree {
	
	static List getList(int x) {
		
		if(x==1) {
			log.info("ArrayList object");
			return new ArrayList();
		}else if(x==2) {
			log.info("LinkedList object");
			return new LinkedList();
		}else if(x==3) {
			log.info("Vector object");
			return new Vector();
		}
		return null;
		
	}

}
