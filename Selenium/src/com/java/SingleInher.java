package com.java;

 class Sample{
	public void test(){
		System.out.println("This is Parent  class");
	}
	
	int x=1000;
}


public class SingleInher extends Sample{

	public void test2(){
		System.out.println("Value of x is ="+x);
	}
	
	public static void main(String[] args) {
		
		SingleInher obj=new SingleInher();
		obj.test();
		obj.test2();
	}
}
