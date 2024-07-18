package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllRowDataFromExcelTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
		//step1:- open workbook in readmode
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = workbook.getSheet("Sheet2");
		//hardcode
//		String value1 = sh.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	
		//read the last row used 
		
		int count = sh.getLastRowNum();
		
		//  count= 4
		System.out.println(count);
		
		
		for (int i = 0; i < count; i++) {
			
		Row row = sh.getRow(i);
		String firstColData = row.getCell(0).getStringCellValue();
		String secondColData = row.getCell(1).getStringCellValue();
		System.out.println(firstColData +"\t" + secondColData);
		
			
		}
		
	}

}
