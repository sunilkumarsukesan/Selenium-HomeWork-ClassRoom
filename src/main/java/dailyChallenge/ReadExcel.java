package dailyChallenge;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/data.xlsx");
		
		//Navigate to sheet1
		XSSFSheet sheet = wBook.getSheetAt(0);
		
		//Reading 2nd row of 3rd column
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
		
		wBook.close();
		
	}

}

