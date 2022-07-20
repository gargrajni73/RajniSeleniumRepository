package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;

//Count no. of paragraphs space in a file
public class CountNoOfParagraphsInFile {

	public static void main(String[] args) throws IOException {

		
		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileInputStream fileStream = new FileInputStream(f);
		byte[] byteArray = new byte[(int)f.length()];
		fileStream.read(byteArray);
	      String data = new String(byteArray);

	      String[] paragraphs = data.toString().split("\r\n\r\n");
		System.out.println("No. of paragraphs are"+paragraphs.length);
	}

}
