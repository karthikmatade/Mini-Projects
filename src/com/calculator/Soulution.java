package com.calculator;
import java.util.Scanner;
public class Soulution {
	static Scanner sc=new Scanner(System.in);
	static int a,b;
	static void acceptInput() {
		System.out.println("Enter 1st element");
		a=sc.nextInt();
		System.out.println("Enter 2nd element");
		b=sc.nextInt();
	}
	public static void main(String[] args) {
		Calculator cc=new CalculatorIml();
		System.out.println("1:Addition\n2:Substraction\n3:Multiplicatio\n4:Division\n5:Exit\nEnter choice");
		int ch=sc.nextInt();
		if(ch>=1&&ch<=4) {
			acceptInput();
		}
		
		switch(ch) {
		case 1:System.out.println(cc.add(a, b));
		break;
		case 2:System.out.println(cc.sub(a, b));
		break;
		case 3:System.out.println(cc.mul(a, b));
		break;
		case 4:System.out.println(cc.div(a, b));
		break;
		case 5:System.exit(0);
		default : System.out.println(cc.displayErrorMessage());
		
		}
		
		
	}

}
