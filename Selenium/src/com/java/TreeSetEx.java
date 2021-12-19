package com.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	
	TreeSet<String> set=new TreeSet<>();
	set.add("HELLO");
	set.add("Guru");
	set.add("Vijay");
	set.add("ajay");
	
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
