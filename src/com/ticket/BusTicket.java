package com.ticket;
public interface BusTicket {
	void bookTicket(int ticket);
	void cancelTicket(int ticket);
	int viewTicket();
	String displayErrorMessage();

}
