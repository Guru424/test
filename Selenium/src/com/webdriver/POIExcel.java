package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xlsx");
	XSSFWorkbook    wb=new XSSFWorkbook(file);
	XSSFSheet       sheet=wb.getSheet("Input");
	
	int rows=sheet.getLastRowNum()+ 1;
	
	System.out.println("Total number of rows ="+rows);
	
	XSSFRow row=sheet.getRow(3);
	XSSFCell cell=row.getCell(0);
	
	System.out.println(cell);
	
	for(int i=0;i<rows;i++){
		Row r=sheet.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++){
			String txt=sheet.getRow(i).getCell(j).toString();
			System.out.print(txt + " ");
		}
		System.out.println();
	}
	
}
}
