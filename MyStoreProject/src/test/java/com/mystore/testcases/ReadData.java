package com.mystore.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public File file;
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	String path = "E:\\Post Graduate\\Velocity\\Git\\AutomationPractice\\MyStoreProject\\Data\\Testdata.xlsx";

	public String readDataFromExcel(String sheetname, int row, int Cell) throws IOException {
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		cell = sheet.getRow(row).getCell(Cell);
		String data = cell.getStringCellValue();

		return data;
	}
	
	public int getRowCount(String sheetname) throws IOException {
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		int rowCount = sheet.getLastRowNum();
		return rowCount;
	}
	
	public int getCellCount(String sheetname, int Row) throws IOException {
		file = new File(path);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetname);
		row = sheet.getRow(Row);
		int cellCount = row.getLastCellNum();
		return cellCount;
	}

}
