package com.webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\output.xlsx");
	XSSFWorkbook    wb=new XSSFWorkbook(file);
	XSSFSheet       sheet=wb.getSheetAt(0);
	
	XSSFRow row=sheet.createRow(0);
	XSSFCell cell=row.createCell(0);
	
	cell.setCellType(Cell.CELL_TYPE_STRING);
	String txt="Welcome to livetech....!!!";
	cell.setCellValue(txt);
	
	FileOutputStream fo=new FileOutputStream("D:\\WeekEnd1.xlsx");
	wb.write(fo);
	
	fo.close();
}
}
