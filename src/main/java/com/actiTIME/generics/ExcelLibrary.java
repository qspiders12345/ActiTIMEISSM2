package com.actiTIME.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary 
{
	public static String getcellValue(String path,String sheet, int row, int cell) throws IOException
	{
		String cellValue="";
		FileInputStream fis=new FileInputStream("E:/ISSM2/SampleFrameworkData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		cellValue=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return cellValue;		
	}
}