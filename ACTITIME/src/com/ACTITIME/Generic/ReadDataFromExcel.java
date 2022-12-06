package com.ACTITIME.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	
	public String ReadDataExcelFile (String Sheetname,int row,int cell) throws IOException {
		FileInputStream f1 = new FileInputStream("./TestData/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
	}
	
	}

