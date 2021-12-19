package com.java;

abstract class Sample1{
	
	void test(){
		
	}
	
	abstract void basic();
}

public class AbstractEx extends Sample1{

	@Override
	void basic() {
		System.out.println("This is abstract method...!!!");		
	}
	
	public static void main(String[] args) {
		
		Sample1 obj=new AbstractEx();
		obj.basic();
	}
	

}
