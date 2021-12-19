package com.java;

public class Variables {

	static int z=10000;
	int y=1000; //instance variable
	public void test1(){
		int x=100; //Local variables
		System.out.println("value of x is ="+x);
	}
	
	public void test2(){
		System.out.println("Value of x is ="+y);
	}
	
	public static void main(String[] args) {
		
		Variables obj=new Variables();
		obj.test1();
		obj.test2();
		System.out.println(z);
	}
}
