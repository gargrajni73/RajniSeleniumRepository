package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//Here we will write the logic for
//Reading the properties file
//It will return object of properties class
public class LoadFile {
	
	public static Properties loadProperties(String filePath) throws IOException
	{
		File f=new File(filePath); //Make connection with the file
		FileReader fr=new FileReader(f);
		Properties prop=new Properties();
		prop.load(fr);
		return prop;
	}
	

}
