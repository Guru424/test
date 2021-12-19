package com.java;

public class TryCatch {
public static void main(String[] args) {
	
	try{
		
		int x=10;
		int y=x/1;
		System.out.println("value of y is ="+y);
		
		int arr[]=new int[2];
		System.out.println(arr[1]);
		
	}catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("Catch block code...");
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e);
	}finally{
		System.out.println("This is finally block....!!!");
	}
}
}
