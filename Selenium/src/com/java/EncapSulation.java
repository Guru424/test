package com.java;

public class EncapSulation {

	private String name;
	private int age;
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public String getName(){
		return name;	
	}
	
	public int getAge(){
		return age;	
	}
	
	public static void main(String[] args) {
		
		EncapSulation obj=new EncapSulation();
		obj.setName("Guru");
		obj.setAge(100);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}
}
