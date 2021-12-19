package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
public static void main(String[] args) throws IOException {
	
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("./FileReader/Object.properties");
	prop.load(file);
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("name"));
}
}
