package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteDataAppend {

		public static void main(String[] args) throws IOException {
			File f=new File("../SourceProject/Rajni Garg Text File.txt");
			FileWriter fw=new FileWriter(f,true);  			//To append the data in existing file
			BufferedWriter bw=new BufferedWriter(fw);
			bw.newLine();
			bw.write("Amita");
			bw.newLine();
			String s="Pallavi";
			bw.write(s);
			bw.newLine();
			bw.write("Shubham Garg");
			bw.close();    		//for saving and closing the file
		}

}
