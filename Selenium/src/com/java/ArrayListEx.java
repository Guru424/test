package com.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<>();
	list.add("Ajay");
	list.add("Guru");
	list.add("Rama");
	list.add("Sri");
	
	/*Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}*/
	
	for(String text:list){
		System.out.println(text);
	}
}
}
