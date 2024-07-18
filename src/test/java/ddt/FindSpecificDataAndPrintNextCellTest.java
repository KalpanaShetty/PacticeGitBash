package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FindSpecificDataAndPrintNextCellTest {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
		//step1:- open workbook in readmode
		Workbook workbook = WorkbookFactory.create(fis);
		String expectedData="Nokia";
		Sheet sh = workbook.getSheet("Sheet2");
		int count=sh.getLastRowNum();
		for(int i=1; i<count; i++) {
			 Row row = sh.getRow(i);
			String firstColData = row.getCell(0).getStringCellValue();
			if(firstColData.equals(expectedData)) {
				String secondCellData = row.getCell(1).getStringCellValue();
				System.out.println("Data Found " + secondCellData);
				break;
			}
		}
	}

}
