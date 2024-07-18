package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
FileInputStream fis = new FileInputStream("./src/test/resources/AppLoginData.properties");
Properties pobj= new Properties();
pobj.load(fis);
String url = pobj.getProperty("URL");
driver.get(url);
String userName = pobj.getProperty("UserName");
String password = pobj.getProperty("Password");
Scanner s= new Scanner(System.in);
System.out.println("Browser");
String browser = s.next();
System.out.println(browser );

//driver.findElement(By.name("user_name")).sendKeys(userName);
//driver.findElement(By.name("user_password")).sendKeys(password);
//driver.findElement(By.id("submitButton")).click();
//Thread.sleep(100);
//driver.quit();
	}

}
