package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class REadTextUsingFileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
 FileReader fr= new FileReader(file);
 int asciCode;
 String text = null;
 
 while ((asciCode =fr.read()) != -1) {
 //System.out.println((char)asciCode);	
	 text+= String.valueOf((char)asciCode);
	// System.out.println((char)asciCode);
 }
 System.out.println();
 System.out.println(text);
 fr.close();
	}

}
