package com.java;

 interface SampleA{
	
	abstract void test();
}

public class InterfaceEx implements SampleA {
public static void main(String[] args) {
	
	SampleA obj=new InterfaceEx();
	obj.test();
}

@Override
public void test() {
	System.out.println("This is Interface method...!!!");	
}
}
