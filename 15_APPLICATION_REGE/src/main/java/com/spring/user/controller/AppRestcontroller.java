package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.bindings.UserData;
import com.spring.user.service.RegService;

@RestController
public class AppRestcontroller {

	@Autowired
	private RegService regService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UserData user) {
		String response = regService.registeruser(user);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
