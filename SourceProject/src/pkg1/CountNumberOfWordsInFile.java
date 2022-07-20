package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;

//Count no. of words in a file
public class CountNumberOfWordsInFile {

	public static void main(String[] args) throws IOException {

		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		while((line=br.readLine())!=null)
		{
			String [] words=line.split(" ");
			count=count+words.length;
		}
		System.out.println("No. of words are"+count);
		
	}

}
