package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
		//step1:- open workbook in readmode
		Workbook workbook = WorkbookFactory.create(fis);
		//step 2: take control of work and open shee
		Sheet sheet = workbook.getSheet("Sheet1");
		
		sheet.getRow(1).createCell(5).setCellValue("Kalpana");
		 
		FileOutputStream fos= new FileOutputStream("./src/test/resources/Testdata.xlsx");
		
		workbook.write(fos);
		
		workbook.close();
		
	}

}
