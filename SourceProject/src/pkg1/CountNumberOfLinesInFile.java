package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;

//Count no. of lines in a file
public class CountNumberOfLinesInFile {

	public static void main(String[] args) throws IOException {

		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		while((line=br.readLine())!=null)
		{
			count=count+1;
		}
		
		System.out.println("No. of Lines are"+count);
	}

}
