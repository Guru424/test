package com.java;

public class Overloading1 {

	public void test(int x){
		System.out.println("Value of x is ="+x);
	}
    public void test(int x,int y){
		int i=x+y;
		System.out.println("Value of i is ="+i);
	}
   public void test(int x,int y,int z){
	
	   System.out.println("Value of ="+(x+y)*z);
   }
   
   public static void main(String[] args) {
	
	   Overloading1 obj=new Overloading1();
	   obj.test(10);
	   obj.test(10, 10);
	   obj.test(10, 10, 10);
}
}
