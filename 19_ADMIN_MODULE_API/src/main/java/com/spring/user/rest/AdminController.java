package com.spring.user.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.binding.AdminAccountData;
import com.spring.user.binding.PlanData;
import com.spring.user.entities.AdminAccountEntity;
import com.spring.user.entities.PlanDetailsEntity;
import com.spring.user.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;

	
	/******* Case Worker Account  **********/

	
	@PostMapping("/createAccount")
	public ResponseEntity<String> createContact(@RequestBody AdminAccountData data) {
		String createAccount = service.createAccount(data);
		return new ResponseEntity<>(createAccount, HttpStatus.CREATED);
	}

	@GetMapping("/getAccount")
	public List<AdminAccountEntity> getAllAccounts() {
		List<AdminAccountEntity> accounts = service.getAccounts();
		return accounts;
	}

	@DeleteMapping("/deleteAccount/{userId}")
	public ResponseEntity<String> deleteAccount(@PathVariable Integer userId) {
		String deleteAccount = service.deleteAccount(userId);
		return new ResponseEntity<>(deleteAccount, HttpStatus.OK);
	}

	@DeleteMapping("/softDelete/{userId}")
	public String accStatus(@PathVariable Integer userId) {
		String accStatus = service.accStatus(userId);
		return accStatus;
	}
	
	
	/************plan management*****************/

	@PostMapping("/createPlan")
	public ResponseEntity<String> createPlan(@RequestBody PlanData data){
		String createPlan = service.createPlan(data);
		return new ResponseEntity<>(createPlan, HttpStatus.CREATED);
	}

	@GetMapping("/getPlandata")
	public List<PlanDetailsEntity> getPlandata() {
		List<PlanDetailsEntity> plandata = service.getAllPlans();
		return plandata; 
	}
	
	@DeleteMapping("/deletePlan/{Id}")
	public ResponseEntity<String> deleteAccountById(@PathVariable Integer userId) {
	String deleteAccount = service.deleteById(userId);
	return new ResponseEntity<>(deleteAccount, HttpStatus.OK);
		}
	
	@GetMapping("/softDelete/{userId}")
	public ResponseEntity<String> planstatus(@PathVariable Integer userId){
		String createPlan = service.planStatus(userId);
		return new ResponseEntity<>(createPlan, HttpStatus.CREATED);
	}
}
