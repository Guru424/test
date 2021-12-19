package com.java;

public class SwitchEx {
public static void main(String[] args) {
	
	int x=100;
	switch(x){
	case 110:
		System.out.println("Value of x is 110");
		break;
	case 120:
		System.out.println("Value of x is 120");
		break;
	case 100:
		System.out.println("Value of x is 100");
		break;
		default:
			System.out.println("This is default statement");
	}
	
	System.out.println("This is out side switch statement");
}
}
