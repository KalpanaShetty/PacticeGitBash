package properticeFilePractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Practice_PropertiesTest {

	public static void main(String[] args) throws Throwable {
		File file = new File("dbConfig.properties");
		if (!file.exists()) {
			file.createNewFile();
		}
		//System.out.println(file.exists());
	//	file.delete();
	Properties pobj= new Properties();
	// as it is extending HAShTable , we can perform all the actions like map
//		pobj.setProperty("Url", "www.google.com");
//		pobj.setProperty("userName", "admin");
//		pobj.setProperty("password", "512");
//		FileOutputStream fos= new FileOutputStream(file);
//		pobj.store(fos, "New profile is created");;
	FileWriter fw = new FileWriter(file);
	pobj.store(fw, "New profile ");
	//FileInputStream fis = new FileInputStream(file);
	FileReader fr= new FileReader(file);
	//pobj.load(fis);
	pobj.load(fr);
		Set<String> keys = pobj.stringPropertyNames();
	//Set<Object> keys = pobj.keySet();
		System.out.println(keys);
//	Collection<Object> values = pobj.values();
//	System.out.println(values);
//	System.out.println(pobj.getProperty("Url"));
//		System.out.println(pobj.getProperty("Uri", "uri NOt found"));
	//System.out.println(pobj);
//	Set<Object> keys = pobj.keySet();
//	for (Object key : keys) {
//		System.out.println(pobj.get(key));
//	}
//	for (Object key: pobj.keySet()) {		
//		System.out.println(pobj.getProperty( (String) key));	
//	}
	Set<Entry<Object, Object>> data = pobj.entrySet();
		for (Entry<Object, Object> entry : data) {
			System.out.println(entry.getKey()+"-->"+ entry.getValue());
		}
//pobj.remove("Url"); //to remove the entry
	}

}
