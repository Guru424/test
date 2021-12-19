package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JExcel {
public static void main(String[] args) throws BiffException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xls");
	Workbook         wb=Workbook.getWorkbook(file);
	Sheet          sheet=wb.getSheet("Input");
	
	int rows=sheet.getRows();
	int columns=sheet.getColumns();
	
	System.out.println("Total number of rows ="+rows);
	System.out.println("Total number of columns ="+columns);
	
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
	String txt=sheet.getCell(j,i).getContents();
	System.out.print(txt+" ");
	
		}
		System.out.println();
	}
}
}
