package com.techchefs.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.techchefs.springboot.beans.EmployeeInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {
	
	
}
