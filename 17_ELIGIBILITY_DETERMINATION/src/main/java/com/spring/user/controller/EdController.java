package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.entities.EligibilityResponse;
import com.spring.user.service.EdService;

@RestController
public class EdController {

	@Autowired
	private EdService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome TO ED Module";
	}
	
	@GetMapping("/eligibility/{caseNum}")
	public ResponseEntity<EligibilityResponse> checkEligibility(@PathVariable Long caseNum ){
		
		EligibilityResponse eligibility = service.checkEligibility(caseNum);
		
		return new ResponseEntity<>(eligibility, HttpStatus.OK);
	}
}
