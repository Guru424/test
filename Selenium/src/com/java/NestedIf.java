package com.java;

public class NestedIf {
public static void main(String[] args) {
	
	int x=10;
	int y=20;
	
	if(x<20){
		if(y<30){
			System.out.println("This is Nested if statement...");
		}
		System.out.println("This is if statement");
	}
	
	System.out.println("This is out side if statement");
	
}
}
