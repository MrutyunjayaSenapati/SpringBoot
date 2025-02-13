package com.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Hello {
	@GetMapping("/msg")
	public ResponseEntity<String>showMsg(){
		return new ResponseEntity<String>("Welcome to RestfulService",HttpStatus.OK);
	}

}
