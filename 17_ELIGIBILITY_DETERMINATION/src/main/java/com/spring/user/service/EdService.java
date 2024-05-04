package com.spring.user.service;

import com.spring.user.entities.EligibilityResponse;

public interface EdService {

	public EligibilityResponse checkEligibility(long ssn);
	
	
}
