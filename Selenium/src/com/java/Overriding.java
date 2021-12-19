package com.java;

class Over{
	public void car(){
		System.out.println("My car name is TATA");
	}
}
public class Overriding extends Over{
	@Override
	public void car(){
		System.out.println("My car name is BMW");
	}
public static void main(String[] args) {
	
	Over obj=new Overriding();
	obj.car();	
}
}
