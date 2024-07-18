package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadTextUsingBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int asciCode;
		String text= null;
		
		while ((asciCode =br.read()) != -1) {
		//System.out.println((char)asciCode);
			text += String.valueOf((char)asciCode);
		}
System.out.println(text);
fr.close();
br.close();
	
	}

}
