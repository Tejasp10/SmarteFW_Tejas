package com.smarte.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	

	public ArrayList<Object[]> Readfromexcel() throws IOException{
		
			ArrayList<Object[]> mydata = new ArrayList<Object[]>();
			FileInputStream fis=new FileInputStream(new File("C:/Users/Tejas/eclipse-workspace/SmarteAutomationFW/TestDataGenerator/TestDataGenerator.xlsx"));
			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); 
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(1);
			XSSFCell Product = sheet.getRow(0).getCell(0);	
			XSSFCell PriceRange = sheet.getRow(0).getCell(1);
			return mydata;
			

	
		
		  
	}

	

}
