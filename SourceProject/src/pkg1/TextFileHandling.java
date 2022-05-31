package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileHandling {

	public static void main(String[] args) throws IOException {

		File f=new File("../SourceProject/Rajni Garg Text File.txt"); //To make a connection with the file
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
	}

}
