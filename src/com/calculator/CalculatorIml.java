package com.calculator;
public class CalculatorIml implements Calculator {

	public String add(int a, int b) {
		int sum=a+b;
		return "sum of "+a+" & "+b+"is "+sum;
	}

	public String sub(int a, int b) {
		int sub =a-b;
		return "Difference of "+a+" & "+b+" is "+sub;
	}

	public String mul(int a, int b) {
		return "Product of "+a+" & "+b+" is "+(a*b);
	}

	public String div(int a, int b) {
		if(b!=0) {
			return "Division of "+a+" & "+b+" is "+(a/b);
		}
		else {
		return "Invalid Denominator!";
	}
	}
	public String displayErrorMessage() {
		return "Inavlid choice pleace enter valid choice";
	}
	

}
