package com.saucedemo.testdata;

import java.io.IOException;

public class CheckApiTestMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelApiTest eat=new ExcelApiTest("C:\\Users\\vmalla\\workspace\\TestSaucedemo\\src\\main\\java\\com\\saucedemo\\testdata\\saucedemo.xlsx");
		int colCount=eat.getColumnCount("saucedemo");
		System.out.println("colCount"+colCount);
		
		int rowCount=eat.getRowCount("saucedemo");
		System.out.println("rowCount"+rowCount);
	}

}
