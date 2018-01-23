package com.automation.datagenerator;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataGenerator {

	@DataProvider(name="Excel")
	
	public static Object[][] testDataGenrator(Method met) throws Exception
	{if(met.getName().equalsIgnoreCase(("AddCustomer")))
		
			{
		
		FileInputStream file =new FileInputStream("E:\\PracticeWorkspace\\Guru99BankProject\\src\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet loginsheet =workbook.getSheet("AddNewCustomer");
		int numberofData=loginsheet.getPhysicalNumberOfRows();
		Object[][] testdata=new Object[numberofData][2];
		
		for(int i=0;i<numberofData;i++)
		{
			XSSFRow row=loginsheet.getRow(i);
			XSSFCell name=row.getCell(0);
			XSSFCell gender=row.getCell(1);
			testdata[i][0]=name.getStringCellValue();
			testdata[i][2]=gender.getStringCellValue();
			
		}
	return testdata;
			}
	else {
		Object [][] testdata=new Object[1][2];
		return testdata;
	}
	}}