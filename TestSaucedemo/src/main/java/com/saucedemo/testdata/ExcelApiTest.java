package com.saucedemo.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApiTest {
	
	
	public FileInputStream fis;
	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String xlFilePath;;
	
	public ExcelApiTest(String xlFilePath) throws IOException{
		//this.xlFilePath=xlFilePath;
		fis=new FileInputStream(xlFilePath);
		workBook=new XSSFWorkbook(fis);
		fis.close();
	}
	
	public int getRowCount(String sheetName){
		sheet=workBook.getSheet(sheetName);
		int rowCount =sheet.getLastRowNum()+1;
		return rowCount;
	
	}
	
	public int getColumnCount(String sheetName){
		sheet=workBook.getSheet(sheetName);
		row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		return colCount;
		
		
	}


}
