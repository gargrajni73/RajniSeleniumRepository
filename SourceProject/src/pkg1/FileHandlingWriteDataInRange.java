package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingWriteDataInRange {
		
	public void WriteDataInaRange(int initialRowCount,int EndRowCount) throws IOException
	{
		File f=new File("../SourceProject/Rajni1 Garg Text File.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter Data");
		Scanner scan=new Scanner(System.in);
		String data=null;
		for(int i=1;i<=EndRowCount;i++)
		{
			if((i>=initialRowCount)&&(i<=EndRowCount))
			{
			data=scan.next();
			bw.write(data);
			bw.newLine();
			}
			else
			{
				bw.newLine();
			}
		}
		bw.close();  
	}
	
	public static void main(String[] args) throws IOException {
		
		FileHandlingWriteDataInRange obj=new FileHandlingWriteDataInRange();
		obj.WriteDataInaRange(4,8);	
	}

}
