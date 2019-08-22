package com.techchefs.librarymanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.techchefs.librarymanagementsystem.beans.RequestDetailsBean;
import com.techchefs.librarymanagementsystem.beans.UserDetailsBean;

public interface UserRepository extends CrudRepository<UserDetailsBean, Integer> {
	
	@Query("select e from UserDetailsBean e") 
	public List<UserDetailsBean> findAllUsers();	
	
	@Query("select e from UserDetailsBean e where e.emailId = :emailId")
	public UserDetailsBean findUserByEmailId(@Param("emailId") String emailId);
	
}
