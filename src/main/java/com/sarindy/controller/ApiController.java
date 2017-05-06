package com.sarindy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping(value="/api/test")
	public String getApi(){
		return "This is API";
	}
	
	@RequestMapping(value="/admin/test")
	public String getAdmin(){
		return "This is Admin";
	}
	
	@RequestMapping(value="/user/test")
	public String getUser(){
		return "This is User";
	}
	
	@RequestMapping(value="/any/test")
	public String getAny(){
		return "This is Any";
	}



}
