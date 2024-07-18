package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileProgram1 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
//file.delete();

FileInputStream fis= new FileInputStream(file);
//System.out.println(fis.read());
int asciCode;
while ((asciCode =fis.read()) != -1) {
System.out.println((char)asciCode);	
}
//System.out.println((char)fis.read());
	}

}
