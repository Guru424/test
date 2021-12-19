package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IteratorExcel {
public static void main(String[] args) throws IOException {
	

	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\webdriver\\input.xlsx");
	XSSFWorkbook    wb=new XSSFWorkbook(file);
	XSSFSheet       sheet=wb.getSheet("Input");
	
	Iterator<Row> rowitr=sheet.iterator();
	while(rowitr.hasNext()){
		Row row=rowitr.next();
		
		Iterator<Cell> cellitr=row.iterator();
		while(cellitr.hasNext()){
			Cell cell=cellitr.next();
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue());
					break;
				}
		}
		System.out.println();
	}
}
}
