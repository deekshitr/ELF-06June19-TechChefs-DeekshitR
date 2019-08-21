package com.techchefs.librarymanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymanagementsystem.beans.UserDetailsBean;
import com.techchefs.librarymanagementsystem.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response login(int id, String password, HttpServletRequest request) {
		
		UserDetailsBean userInfo = repository.findById(id).get();
		
		Response response = new Response();
		
		if (userInfo != null && userInfo.getPassword().equals(password)) {
			
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Logged in Successfully");
			response.setUserDetailsBean(userInfo);
			
		} else {
			response.setStatusCode(301);
			response.setMessage("Failure");
			response.setDescription("Invalid Credentials");
		}
		
		return response;
		
	}
	
	@PostMapping(path = "/adduser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addUser(@RequestBody UserDetailsBean userDetailsBean) {
		
		Response response = new Response();
		
		if (userDetailsBean.getId() == null) {// && !repository.existsById(userDetailsBean.getId())) {
			repository.save(userDetailsBean);
			response.setStatusCode(201);
			response.setMessage("Insertion Successfull");
			response.setDescription("User details added to the database");
			response.setUserDetailsBean(userDetailsBean);
		} else {
			response.setStatusCode(301);
			response.setMessage("Insertion failed");
			response.setDescription("Failed to add User details");
		}
		
		return response;
	}
	
	@PutMapping(path = "/updateuser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response editUser(@RequestBody UserDetailsBean userDetailsBean) {
		Response response = new Response();
		
		if (repository.existsById(userDetailsBean.getId())) {
			repository.save(userDetailsBean);
			response.setStatusCode(201);
			response.setMessage("Update Successfull");
			response.setDescription("Employee details updated in database");
		} else {
			response.setStatusCode(301);
			response.setMessage("Updation failed");
			response.setDescription("Failed to update Employee details");
		}
		
		return response;
	}
	
	@GetMapping(path = "/getuser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getUser(@RequestParam int id) {

		Response response = new Response();

		if (repository.existsById(id)) {
			UserDetailsBean userDetailsBean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setUserDetailsBean(userDetailsBean);
			response.setMessage("Successfull");
			response.setDescription("Employee details fetched from the database");
		} else {
			response.setStatusCode(301);
			response.setMessage("failed");
			response.setDescription("Failed to fetch Employee details");
		}
		return response;

	}
	
	@GetMapping(path = "/getalluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getAllEmployee() {
		
		List<UserDetailsBean> userDetailsBeans = repository.findAllUsers();

		Response response = new Response();

		if (userDetailsBeans != null) {

			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data found successfully");
			response.setUserDetailsBeans(userDetailsBeans);
		} else {

			response.setStatusCode(301);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");

		}
		return response;

	}
	
	@DeleteMapping(path = "/deleteuser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response deleteEmployee(@RequestParam int id) {

		Response response = new Response();

		UserDetailsBean infoBean = repository.findById(id).get();

		if (infoBean != null) {
			repository.delete(infoBean);
			response.setStatusCode(201);
			response.setMessage("Delete Successfull");
			response.setDescription("Employee details deleted from the database");

		} else {
			response.setStatusCode(301);
			response.setMessage("Deletion failed");
			response.setDescription("Failed to delete Employee details");
		}

		return response;

	}
	
}
