package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileHandlingLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null) //readLine method belongs to BufferedReader class
		{
			System.out.println(line);
		}
	}

}
