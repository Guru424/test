package com.java;

import java.util.Date;

public class GetdateTime {
public static void main(String[] args) {
	
	Date date=new Date();
	System.out.println(date.toString());
	
	System.out.println(date.getDay());
	System.out.println(date.getMonth());
}
}
