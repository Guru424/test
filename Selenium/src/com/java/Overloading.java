package com.java;

public class Overloading {
	
	public void mobile(String name){
		System.out.println("My mobile name is ="+name);
	}
	
	public void mobile(int cost){
		System.out.println("My mobile cost is ="+cost);
	}
	
public static void main(String[] args) {
	
	Overloading obj=new Overloading();
	obj.mobile("Sony");
	obj.mobile(30000);
}
}
