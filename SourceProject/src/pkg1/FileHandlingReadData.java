package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReadData {
	
	public void ReadData(int rowNo) throws IOException
	{
		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		while((line=br.readLine())!=null)
		{
			count++;
			if(count==rowNo)
			{
				System.out.println(line);
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		FileHandlingReadData obj=new FileHandlingReadData();
		obj.ReadData(5);	
	}

}
