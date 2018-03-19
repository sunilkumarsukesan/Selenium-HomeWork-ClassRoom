package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public Object[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub

		//Open workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");

		//Navigate to sheet1
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		
		//Get the row count
		int rowCount = sheetAt.getLastRowNum();

		//Get the column count
		XSSFRow row = sheetAt.getRow(0);
		int cellCount = row.getLastCellNum();
		
		//create an object for the object array
		Object[][] data = new Object [rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {	
			row = sheetAt.getRow(i);	//go to row
			for (int j = 0; j < cellCount; j++) {
				data [i-1][j]=(row.getCell(j).getStringCellValue());
			} 
		}
		wBook.close();
		return data;
	}
}
