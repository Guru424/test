package com.java;

interface interface1{
	String txt="First";
	void test();
	
}

interface interface2{
	String txt1="Second";
	void test2();
}
public class MultiInheri implements interface1,interface2 {

	@Override
	public void test2() {
		System.out.println("This is "+txt1+" interface method");
		
	}

	@Override
	public void test() {
		System.out.println("This is "+txt+" interface method");
		
	}
	
	public static void main(String[] args) {
		MultiInheri obj=new MultiInheri();
		obj.test();
		obj.test2();
	}

}
