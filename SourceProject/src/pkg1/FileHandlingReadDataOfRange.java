package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingReadDataOfRange {
		
	public void ReadDataOfRange(int rowNoInitial,int rowNoEnd) throws IOException
	{
		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int count=0;
		while((s=br.readLine())!=null)
		{
			count++;
			if((count>=rowNoInitial)&&(count<=rowNoEnd))
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		FileHandlingReadDataOfRange obj=new FileHandlingReadDataOfRange();
		obj.ReadDataOfRange(3,7);
	}

}
