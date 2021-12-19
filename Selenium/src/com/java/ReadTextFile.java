package com.java;

import java.io.*;

public class ReadTextFile {
public static void main(String[] args) throws IOException {
	
	
	//FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\com\\java\\FileReader.txt");
	
	FileReader file=new FileReader("./FileReader/FileReader.txt");
	BufferedReader buffRead=new BufferedReader(file);
	
	String txt=null;
	
	while((txt=buffRead.readLine())!= null){
		System.out.println(txt);
	}
}
}
