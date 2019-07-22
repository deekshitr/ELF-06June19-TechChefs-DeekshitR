package com.techchefs.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.techchefs.librarymanagementsystem.beans.BookDetailsBean;

public interface BookingsRepository extends CrudRepository<BookDetailsBean, Integer> {
	
	@Query("select b from BookDetailsBean b") 
	public List<BookDetailsBean> findAllBooks();
	
}
