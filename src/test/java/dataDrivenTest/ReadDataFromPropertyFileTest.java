package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFileTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/AppLoginData.properties");
        Properties pobj= new Properties();
        pobj.load(fis);
      String url = pobj.getProperty("URL");
      System.out.println(url);
      String number = pobj.getProperty("number");
      System.out.println(number);
	}

}
