package ddt;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadTheDataFromPropertiesTest {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = null;
		FileInputStream fis= new FileInputStream("./src/test/resources/AppLoginData.properties");
		Properties  pobj= new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("Browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new  FirefoxDriver();

		}else {
			System.err.println("invalid browser");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String url=pobj.getProperty("URL");
		driver.get(url);
		String un=pobj.getProperty("UserName");
		driver.findElement(By.name("user_name")).sendKeys(un);
		String pwd=pobj.getProperty("Password");
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		driver.quit();
		


	}
}