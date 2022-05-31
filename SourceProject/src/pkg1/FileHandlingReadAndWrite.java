package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReadAndWrite {
	
	public void ReadAndWrite() throws IOException
	{
		File f1=new File("../SourceProject/Rajni Garg Text File.txt");
		File f2=new File("../SourceProject/Rajni Garg Destination Text File");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String line;
		while((line=br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}	
			br.close();
			bw.close();	
	}

	public static void main(String[] args) throws IOException {
		
		FileHandlingReadAndWrite obj=new FileHandlingReadAndWrite();
		obj.ReadAndWrite();		
	}

}
