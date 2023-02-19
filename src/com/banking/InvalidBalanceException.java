package com.banking;

public class InvalidBalanceException extends RuntimeException{
	private String message;
	
	InvalidBalanceException(String message){
		this.message=message;
	}
	
	
	public String getMessage() {
		return message;
	}


	}

