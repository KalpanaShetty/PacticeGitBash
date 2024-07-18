package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderProgram3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileInputStream fis= new FileInputStream(file);
		InputStreamReader isr= new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		int asciCode;
		String text= new String();
		String line= new String();
		while ((line=br.readLine())!=null) {
	//System.out.println(line);
			text += line + "\n"; 	
		}
System.out.println(text);
fis.close();
isr.close();
br.close();
	}

}
