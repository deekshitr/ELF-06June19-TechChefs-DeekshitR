package com.techchefs.hibernetapp.cache;

import org.hibernate.Session;

import com.techchefs.hibernetapp.cache.util.HibernateCacheUtil;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {
		log.info("1st : "+getEmployeeData(1).toString());
		log.info("2nd : "+getEmployeeData(1).toString());
		log.info("3rd : "+getEmployeeData(1).toString());
		
	}

	private static NewEmployeeInfoBean getEmployeeData(int id) {
	
		NewEmployeeInfoBean bean = null;
		
		try(Session ses = HibernateCacheUtil.openSession();) {
			bean = ses.get(NewEmployeeInfoBean.class, id);
			log.info("1st bean : "+bean);
		}
		
		return bean;
	}
}
