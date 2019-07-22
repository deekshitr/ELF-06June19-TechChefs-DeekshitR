package com.techchefs.librarymanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymanagementsystem.beans.BookDetailsBean;
import com.techchefs.librarymanagementsystem.beans.UserDetailsBean;
import com.techchefs.librarymanagementsystem.repository.BookingsRepository;

@RestController
public class BookController {
	
	@Autowired
	BookingsRepository repository;
	
	@PostMapping(path = "/addbookdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookResponse addBook(@RequestBody BookDetailsBean bookDetailsBean) {
		
		BookResponse response = new BookResponse();
		
		if (bookDetailsBean.getId() == null) {
			repository.save(bookDetailsBean);
			response.setStatusCode(201);
			response.setMessage("Insertion Successfull");
			response.setDescription("Book details added to the database");
			response.setBookDetailsBeans(Arrays.asList(bookDetailsBean));
		} else {
			response.setStatusCode(301);
			response.setMessage("Insertion failed");
			response.setDescription("Failed to add Book details");
		}
		
		return response;
	}
	
	@PutMapping(path = "/updatebookdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookResponse updateBook(@RequestBody BookDetailsBean bookDetailsBean) {
		
		BookResponse response = new BookResponse();
		
		if (repository.existsById(bookDetailsBean.getId())) {
			repository.save(bookDetailsBean);
			response.setStatusCode(201);
			response.setMessage("Update Successfull");
			response.setDescription("Book details updated to the database");
			response.setBookDetailsBeans(Arrays.asList(bookDetailsBean));
		} else {
			response.setStatusCode(301);
			response.setMessage("Updation failed");
			response.setDescription("Failed to update Book details");
		}
		
		return response;
	}
	
	@GetMapping(path = "/getbookdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookResponse getBook(@RequestParam int id) {
		
		BookResponse response = new BookResponse();
		
		if (repository.existsById(id)) {
			BookDetailsBean bookDetailsBean = repository.findById(id).get();
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Book details fetched from the database");
			response.setBookDetailsBeans(Arrays.asList(bookDetailsBean));
		} else {
			response.setStatusCode(301);
			response.setMessage("failed");
			response.setDescription("Failed to fetch Book details");
		}
		
		return response;
	}
	
	@GetMapping(path = "/getallbookdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookResponse getAllBook() {
		
		List<BookDetailsBean> bookDetailsBeans = repository.findAllBooks();
		
		BookResponse response = new BookResponse();
		
		if (bookDetailsBeans != null) {
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Book details fetched from the database");
			response.setBookDetailsBeans(bookDetailsBeans);
		} else {
			response.setStatusCode(301);
			response.setMessage("failed");
			response.setDescription("Failed to fetch Book details");
		}
		
		return response;
	}
	
	@DeleteMapping(path = "/deletebookdetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookResponse deleteBook(@RequestParam int id) {

		BookResponse response = new BookResponse();

		BookDetailsBean bookDetailsBean = repository.findById(id).get();

		if (bookDetailsBean != null) {
			repository.delete(bookDetailsBean);
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
	
	//@PostMapping(path = "/issuebook", produces = MediaType.APPLICATION_JSON_VALUE)
	
}
