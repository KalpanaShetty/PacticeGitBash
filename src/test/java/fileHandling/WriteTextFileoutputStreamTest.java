package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFileoutputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("./sample.txt");
if(file.exists())
	file.delete();
file.createNewFile();
String s= "Hello";
FileOutputStream fos= new FileOutputStream(file);
for(char ch : s.toCharArray()) {
	fos.write((int)ch);
	
}
//fos.write(75);
//fos.write(80);
//fos.write(72);
//fos.write(75);
//fos.write(75);
fos.flush();

fos.close();	}

}
