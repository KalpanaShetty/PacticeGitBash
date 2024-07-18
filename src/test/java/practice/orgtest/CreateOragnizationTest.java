package practice.orgtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOragnizationTest {

	public static void main(String[] args) throws Throwable {
		//Read common data from properties file
		FileInputStream fis = new FileInputStream("./src/test/resources/AppLoginData.properties");
        Properties pobj= new Properties();
        pobj.load(fis);
      String URL = pobj.getProperty("url");
      String BROWSER = pobj.getProperty("browser");
      String USERNAME = pobj.getProperty("username");
      String PASSWORD = pobj.getProperty("password");
      
      //generate random number
      Random random = new Random();
     int randomInt = random.nextInt(1000);
     
     //read testscript data from excel
     FileInputStream fis1 = new FileInputStream("./src/test/resources/testScriptdata.xlsx");
    Workbook wb = WorkbookFactory.create(fis1);
   Sheet sh = wb.getSheet("org");
    Row row = sh.getRow(1);
   String orgName = row.getCell(2).toString() + randomInt;
   wb.close();
   WebDriver driver= null;
   if(BROWSER.equalsIgnoreCase("chrome")) {
	   driver= new ChromeDriver();
 }else if (BROWSER.equalsIgnoreCase("firefox")) {
	 driver= new FirefoxDriver();
}else if(BROWSER.equalsIgnoreCase("edge")) {
	driver= new EdgeDriver();
}else{	
	driver= new ChromeDriver();
}
   
   //step1 :- login to app
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   driver.manage().window().maximize();
   driver.get(URL);
   driver.findElement(By.name("user_name")).sendKeys(USERNAME);
   driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
   driver.findElement(By.id("submitButton")).click();
   //Step2 :- navigate to organization module
   driver.findElement(By.linkText("Organizations")).click();
   //step3:- click on create org button
   driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
   //step4:- enter all the details and create new org
   driver.findElement(By.name("accountname")).sendKeys(orgName);
   driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
   // verify header message expected results 
  String headerInfo= driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
  if(headerInfo.contains(orgName)) {
	  System.out.println(orgName  + "is created == PASS");	  
  }else {
	  System.out.println(orgName  + "is not created == Fail");	  
  }
  //verify Header org info expected results
  String actOrgName=driver.findElement(By.id("dtlview_Organization Name")).getText();
  
  if (actOrgName.equals(orgName)) {
	  System.out.println(orgName  + "is created == PASS");	 
  }else {
	  System.out.println(orgName  + "is not created == FAIL");	 
  }
  //Step5:- logout
   Actions act = new Actions(driver);
   act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))); 
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
driver.quit();
	}

}
