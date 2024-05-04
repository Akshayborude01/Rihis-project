package com.spring.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ArWebServiceExceptionHandler {
	
	@ExceptionHandler(value = AppException.class)
	public ResponseEntity<ExceptionInfo> appExpHandler(AppException appExp){
		
		String msg = appExp.getMessage();
		
		ExceptionInfo info = new ExceptionInfo();
		
		info.setExCode("7689477");
		info.setExmsg(msg);
		
		return new ResponseEntity (info, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
