package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDataToExistingDataInTExtFile {

	public static void main(String[] args) throws Throwable {
		File file = new File("./sample.txt");
		//if(!file.exists())
		//	file.createNewFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String exustingText="";
		String line="";
		while((line=br.readLine() )!= null) 
			exustingText += line + "\n";
			String s ="kalpana";
			
			BufferedWriter bw= new BufferedWriter(new FileWriter(file));
			bw.write(exustingText + s);
			bw.flush();
			bw.close();
		

	}

}
