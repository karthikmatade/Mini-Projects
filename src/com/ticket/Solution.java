package com.ticket;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		BusTicket bt =new BusImpl(200);
		System.out.println("WLECOME TO KDM TRAVELS");
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1:To Book Ticket press "
					+ "1\n2:To Cancel Ticket press 2\n3:To View Tickets press 3\n4:To exit press 4");
			System.out.println("plese select above option");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter no ticket to book");
			bt.bookTicket(sc.nextInt());
			break;
			case 2:System.out.println("Enter no of ticket to be cancel");
			bt.cancelTicket(sc.nextInt());
			break;
			case 3:System.out.println("The avilable  ticket is "+bt.viewTicket());
			break;
			case 4: System.out.println("Thank you!!!!!!!!!");
			System.exit(0);
			break;
			default :System.out.println(bt.displayErrorMessage());
			}

		}
	}
}


