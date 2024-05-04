package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user.binding.Education;
import com.spring.user.binding.Income;
import com.spring.user.binding.KidsInfo;
import com.spring.user.binding.PlanSelectionData;
import com.spring.user.binding.Summary;
import com.spring.user.service.DataService;

@RestController
public class DcRestController {

	@Autowired
	private DataService service;

	@GetMapping("/welcome")
	public String welcome() {

		return "Welcome to Dc Module";
	}

	@GetMapping("/case/{id}")
	public ResponseEntity<PlanSelectionData> createCase(@PathVariable Integer id) {

		PlanSelectionData createCase = service.createCase(id);

		return new ResponseEntity<>(createCase, HttpStatus.OK);
	}

	@PostMapping("/applyPlan")
	public ResponseEntity<Long> applyPlan(@RequestBody PlanSelectionData plan) {

		Long caseNum = service.updateCitizenPlan(plan);

		return new ResponseEntity<>(caseNum, HttpStatus.OK);
	}

	@PostMapping("/saveIncome")
	public ResponseEntity<Long> saveIncome(@RequestBody Income income) {

		Long info = service.saveIncomeInfo(income);

		return new ResponseEntity<>(info, HttpStatus.OK);
	}

	@PostMapping("/saveEducation")
	public ResponseEntity<Long> saveEducation(@RequestBody Education education) {

		Long saveEducation = service.saveEducationInfo(education);

		return new ResponseEntity<>(saveEducation, HttpStatus.OK);
	}

	@PostMapping("/saveKids")
	public ResponseEntity<Summary> saveKids(@RequestBody KidsInfo kids) {

		Summary summary = service.savekids(kids);

		return new ResponseEntity<>(summary, HttpStatus.OK);
	}
}
