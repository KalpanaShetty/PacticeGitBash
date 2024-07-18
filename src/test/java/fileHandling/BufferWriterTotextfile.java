package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriterTotextfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file = new File("./sample.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		String s= "Hello";
		//BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(file));
		
		BufferedWriter bw= new BufferedWriter(new FileWriter(file));
		bw.write(s);
		bw.flush();
		bw.close();
		
		
		
	}

}
