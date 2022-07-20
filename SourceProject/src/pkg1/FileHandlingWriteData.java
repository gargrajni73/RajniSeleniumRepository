package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingWriteData {
	
	public void WriteData(int rowCount) throws IOException
	{
		File f=new File("../SourceProject/Rajni Garg1 Text File.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter Data");
		Scanner scan=new Scanner(System.in);
		String data=null;
		for(int i=0;i<rowCount;i++)
		{
			data=scan.next();
			bw.write(data);
			bw.newLine(); 
		}
		bw.close(); 
	
	}
	
	public static void main(String[] args) throws IOException {
		
		FileHandlingWriteData obj=new FileHandlingWriteData();
		obj.WriteData(3);
		
	}

}
