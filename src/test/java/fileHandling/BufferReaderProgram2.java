package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderProgram2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int asciCode;
		String text= new String();
		String line= new String();
		while ((line=br.readLine())!=null) {
	//System.out.println(line);
			text += line + "\n"; 	
		}
System.out.println(text);
fr.close();
br.close();

	}

}
