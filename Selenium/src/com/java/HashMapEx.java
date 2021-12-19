package com.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1001, "Selenium");
		map.put(1002, "QTP");
		map.put(1003, "Test Comple");
		map.put(1002, "Silk");
		map.put(1004, "Selenium");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
	}
}
