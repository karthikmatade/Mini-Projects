package com.ticket;

public class BusImpl implements BusTicket {
private int ticketAvail;
public BusImpl(int ticketAvail) {
	this.ticketAvail = ticketAvail;
}
	@Override
	public void bookTicket(int ticket) {
		if(ticketAvail>=ticket) {
		ticketAvail=ticketAvail-ticket;
		System.out.println(ticket+" Ticket booked successfully ");
	}
		
		else {
			try {
				throw  new TicketAreNotAvailable("Sorry!!!! ticket are not avilabel");
			}
			catch(TicketAreNotAvailable e) {
			System.out.println(e.getMessage());
		}
		}
	}

	@Override
	public void cancelTicket(int ticket) {
		ticketAvail=ticketAvail+ticket;
		System.out.println(ticket+" Canceled Successfully");
		
		
	}

	@Override
	public int viewTicket() {
		return ticketAvail;
	}

	@Override
	public String displayErrorMessage() {
		return "Ooops!!!!! Invalid choice";
		
		
		
	}

	
}
