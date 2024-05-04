package com.spring.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.spring.user.bindings.UserData;
import com.spring.user.entities.AppUser;
import com.spring.user.exception.AppException;
import com.spring.user.repositories.AppUserRepository;

@Service
public class RegServiceImpl implements RegService {

	@Autowired
	private AppUserRepository userRepository;

	private static final String REST_URL = "http://ssawebapi-env.eba-k88bsahp.ap-south-1.elasticbeanstalk.com/ssn/{ssn}";

	@Override
	public String registeruser(UserData user) {
		String stateName = null;
		long ssn = user.getSsn();
		
		WebClient webclient = WebClient.create();
		try {
		 stateName = webclient.get()// represents get method
				
				.uri(REST_URL, ssn) // specify url to hit
				.retrieve() // extract response
				.bodyToMono(String.class) // bind response
				.block(); // sync call
		}
		catch(Exception e) {
			throw new AppException(e.getMessage());
		}
		if ("RHODE ISLAND".equals(stateName)) {
             
			AppUser entity = new AppUser();
			
			BeanUtils.copyProperties(user, entity);
			
			AppUser save = userRepository.save(entity);
			
			return "Citizen App Created, App ID : {appId}" + save.getId();
		}

		return "Citizen Not Belongs To RI";
	}

}
