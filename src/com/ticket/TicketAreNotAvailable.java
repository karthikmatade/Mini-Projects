package com.ticket;

public class TicketAreNotAvailable  extends RuntimeException{
	private String message;
	public TicketAreNotAvailable(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	

}
