package com.java;

import java.util.ArrayDeque;

public class ArrayDequeEx {
public static void main(String[] args) {
	
	ArrayDeque<String> que=new ArrayDeque<>();
	que.add("Guru");
	que.add("Ram");
	que.addLast("Rajesh");	
	que.addFirst("Raghu");
	
	for(String txt:que){
		System.out.println(txt);
	}
}
}
