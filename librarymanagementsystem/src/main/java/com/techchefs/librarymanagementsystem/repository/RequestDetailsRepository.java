package com.techchefs.librarymanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.techchefs.librarymanagementsystem.beans.RequestDetailsBean;

public interface RequestDetailsRepository extends CrudRepository<RequestDetailsBean, Integer> {
	
}
