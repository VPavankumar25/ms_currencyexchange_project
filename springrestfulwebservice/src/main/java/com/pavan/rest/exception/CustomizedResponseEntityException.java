package com.pavan.rest.exception;

import java.io.IOException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityException implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		// TODO Auto-generated method stub

	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex,WebRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails ,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> userNotFoundException(Exception ex,WebRequest request)
	{
		ErrorDetails errorDetails=new ErrorDetails(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity(errorDetails ,HttpStatus.NOT_FOUND);
	}
	
	
	

}
