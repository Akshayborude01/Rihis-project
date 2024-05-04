package com.spring.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.entities.CoResponse;
import com.spring.user.service.CoService;

@RestController
public class COcontrolle {

	@Autowired
	private CoService service;

	@GetMapping("/sendnotice")
	public ResponseEntity<CoResponse> sendNotice() {
		CoResponse notices = service.sendNotices();
		return new ResponseEntity<>(notices, HttpStatus.OK);
	}

}
