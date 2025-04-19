package TestProject.ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
    
	@Test
	public void excelDatatest() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/Data.xlsx");
        
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		
		System.out.println(rows +"  "+cell);

		System.out.println("End of program");
		
		
	}
	
}
