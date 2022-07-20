package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacterFromFile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("../SeleniumProject/Rajni Garg Text File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line;
		LinkedHashSet<String> hs=new LinkedHashSet<String>(1000);
		while((line=br.readLine())!=null)
		{
			hs.add(line);
		}
		br.close();
		FileWriter fw=new FileWriter("../SeleniumProject/Rajni Garg Text File1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		for(String h:hs)
		{
			bw.write(h);
			bw.newLine();
		}
		bw.close();		
	}
		
}