package com.banking;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Bank bb= new BankImpl(200); //UPCASTING -->ABSTARCT
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Deposite amount\n2.Withdraw amount\n3.Check balance\n4.Exit");
		System.out.println("Enter choice");
		int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Amount to be Deposited");
				int amountToDeposite=sc.nextInt();
				bb.deposite(amountToDeposite);  //bb.deposite(scan.nextInt());
				break;

			case 2:
				System.out.println("Enter amount to be withdraw");
				bb.withdraw(sc.nextInt());
				break;

			case 3:
				System.out.println("The available balance is "+bb.getBalance());
				break;

			case 4:
				System.out.println("Thank you");
				System.exit(0);
				break;

			default :System.out.println(bb.displayErrorMessage());
			}

		}
	}
}

