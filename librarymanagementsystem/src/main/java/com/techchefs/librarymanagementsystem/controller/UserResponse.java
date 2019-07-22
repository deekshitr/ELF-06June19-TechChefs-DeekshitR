package com.techchefs.librarymanagementsystem.controller;

import java.util.List;

import com.techchefs.librarymanagementsystem.beans.RequestDetailsBean;
import com.techchefs.librarymanagementsystem.beans.UserDetailsBean;

import lombok.Data;

@Data
public class UserResponse {
	
	private int statusCode;
	
	private String message;
	
	private String description;
		
	private List<UserDetailsBean> userDetailsBeans;	
	
	private List<RequestDetailsBean> reqDetailsBean;	
	
}
