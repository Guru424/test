package com.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
public static void main(String[] args) throws IOException {
	
	FileWriter file=new FileWriter("D:\\Output123.txt");
	BufferedWriter buffWrite=new BufferedWriter(file);
	
	String txt="Welcome to livetech....!!!!";
	buffWrite.write(txt);
	buffWrite.close();
}
}
