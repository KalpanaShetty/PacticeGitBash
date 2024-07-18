package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFRomExcelTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("./src/test/resources/Testdata.xlsx");
//step1:- open workbook in readmode
Workbook workbook = WorkbookFactory.create(fis);
//step 2: take control of work and open sheet
Sheet sheet = workbook.getSheet("Sheet1");
//step3: get  the control of the row
Row row = sheet.getRow(0);
////step4:- get the contgrol of the cell
Cell cell = row.getCell(0);
////step5: fetch the value 
String value = cell.getStringCellValue();
////close the workbook
workbook.close();
//System.out.println(value);


String value1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(value1);




	}

}
