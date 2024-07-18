package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTowritetext {

	public static void main(String[] args) throws Throwable {
		File file = new File("./sample.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		String s= "Hello";
		FileWriter fw= new FileWriter(file);
		

fw.write(s);
fw.flush();

	}

}
