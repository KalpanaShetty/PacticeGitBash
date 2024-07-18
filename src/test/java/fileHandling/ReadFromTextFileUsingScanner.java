package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromTextFileUsingScanner {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		Scanner scanner= new Scanner(file);
		String text = null;
		
		while (scanner.hasNextLine()) {
			//System.out.println(	scanner.next());
			//System.out.println(	scanner.nextLine());
			text+=scanner.nextLine() + "\n";
		}
		System.out.println(text);
		scanner.close();
		
	}

}
