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

import com.techchefs.librarymanagementsystem.beans.RequestDetailsBean;
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
	public UserResponse login(int id, String password, HttpServletRequest request) {
		
		UserDetailsBean userInfo = repository.findById(id).get();
		
		UserResponse response = new UserResponse();
		
		if (userInfo != null && userInfo.getPassword().equals(password)) {
			
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Logged in Successfully");
			response.setUserDetailsBeans(Arrays.asList(userInfo));
			
		} else {
			response.setStatusCode(301);
			response.setMessage("Failure");
			response.setDescription("Invalid Credentials");
		}
		
		return response;
		
	}
	
	@PostMapping(path = "/adduserdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse addUser(@RequestBody UserDetailsBean userDetailsBean) {
		
		UserResponse response = new UserResponse();
		
		if (userDetailsBean.getId() == null) {
			repository.save(userDetailsBean);
			response.setStatusCode(201);
			response.setMessage("Insertion Successfull");
			response.setDescription("User details added to the database");
			response.setUserDetailsBeans(Arrays.asList(userDetailsBean));
		} else {
			response.setStatusCode(301);
			response.setMessage("Insertion failed");
			response.setDescription("Failed to add User details");
		}
		
		return response;
	}
	
	@PutMapping(path = "/updateuserdetails", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse editUser(@RequestBody UserDetailsBean userDetailsBean) {
		UserResponse response = new UserResponse();
		
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
	
	@GetMapping(path = "/getuserdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getUser(@RequestParam int id) {

		UserResponse response = new UserResponse();

		if (repository.existsById(id)) {
			UserDetailsBean userDetailsBean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setUserDetailsBeans(Arrays.asList(userDetailsBean));
			response.setMessage("Successfull");
			response.setDescription("Employee details fetched from the database");
		} else {
			response.setStatusCode(301);
			response.setMessage("failed");
			response.setDescription("Failed to fetch Employee details");
		}
		return response;

	}
	
	@GetMapping(path = "/getalluserdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getAllEmployee() {
		
		List<UserDetailsBean> userDetailsBeans = repository.findAllUsers();

		UserResponse response = new UserResponse();

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
	
	@DeleteMapping(path = "/deleteuserdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteEmployee(@RequestParam int id) {

		UserResponse response = new UserResponse();

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
	
	/*
	 * @PostMapping(path = "/requestbook", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public UserResponse editUser(@RequestBody
	 * RequestDetailsBean reqDetailsBean) { UserResponse response = new
	 * UserResponse();
	 * 
	 * if (reqDetailsBean.getId() == null) { repository.save(reqDetailsBean);
	 * response.setStatusCode(201); response.setMessage("Insertion Successfull");
	 * response.setDescription("User details added to the database");
	 * response.setReqDetailsBean(Arrays.asList(reqDetailsBean)); } else {
	 * response.setStatusCode(301); response.setMessage("Insertion failed");
	 * response.setDescription("Failed to add User details"); }
	 * 
	 * return response;
	 * 
	 * }
	 */
	
	
}
