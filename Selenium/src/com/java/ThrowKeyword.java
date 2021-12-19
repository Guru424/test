package com.java;

public class ThrowKeyword {

	static void validateAge(int age){
		
		if(age<18){
			throw new ArithmeticException("I am not elible");
		}else{
			System.out.println("I am elible");
		}
	}
	
	public static void main(String[] args) {
		validateAge(15);
	}
}
