package com.ismek.exphandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestResponseExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> HataHandle(Exception e) {
		
		return new ResponseEntity<Object>(e.getLocalizedMessage(),HttpStatus.NO_CONTENT);
	}
	
}
