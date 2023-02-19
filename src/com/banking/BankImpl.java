package com.banking;
public class BankImpl implements Bank {
	private int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
public 	void deposite(int amount) {
	System.out.println("Depositing Rs "+amount);
	balance=balance+amount;  //balance+=amount
	System.out.println("Amount Deposited Successfully");
}
public void withdraw(int amount) {
	if(amount<=balance) {
		System.out.println("Withdrawing amount Rs "+amount);
		balance=balance-amount;//balance-=amount;
		System.out.println("Amount withdrwan successfully");
	}
	
	else {
		try {
			throw new InvalidBalanceException("Insufficient Balance");
		}
		
		catch(InvalidBalanceException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
}

public int getBalance() {
	return balance;
}
public String displayErrorMessage() {
	return "Invalid Choice,Kindly select valid choice";
}

}
