package com.java;

import java.util.PriorityQueue;

public class PriorityQueueEx {
public static void main(String[] args) {
	
	PriorityQueue<String> que=new PriorityQueue<>();
	que.add("Vijay");
	que.add("Json");
	que.add("Jennings");
	
System.out.println(que.element());

	for(String txt:que){
		System.out.println(txt);
	}
}
}
