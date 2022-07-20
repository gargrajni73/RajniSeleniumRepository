package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteDataSingleLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../SourceProject/Rajni Garg Text File.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Ojas Singla"); //write method belongs to BufferedWriter class
		bw.newLine();
		String s="Lovish";
		bw.write(s);
		bw.newLine();
		bw.write("Rajni Garg");
		bw.close();    		//for saving and closing the file
	}

}
