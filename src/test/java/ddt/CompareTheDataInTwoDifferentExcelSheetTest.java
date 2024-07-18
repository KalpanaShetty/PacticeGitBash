package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompareTheDataInTwoDifferentExcelSheetTest {

	public static void main(String[] args) throws Throwable {

       
FileInputStream fis1 = new FileInputStream("./src/test/resources/BookOne.xlsx");
FileInputStream fis2 = new FileInputStream("./src/test/resources/BookTwo.xlsx");
Workbook bookOne = WorkbookFactory.create(fis1);
Workbook bookTwo = WorkbookFactory.create(fis2);
Sheet s1 = bookOne.getSheet("Sheet1");

int count = s1.getLastRowNum();



for(int i= 0; i<count;i++) {
	
	String data1 = bookOne.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	String data2 = bookTwo.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
	
	if( data1.equals(data2)) {
		System.out.println("FOund same value");
	}else {
		System.out.println("Differenet values found");
	}
}
bookOne.close();
bookTwo.close();
	} 
}

