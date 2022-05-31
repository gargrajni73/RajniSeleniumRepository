package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
public ChromeDriver driver;
public Properties prop;
	
	@BeforeMethod
	public void beforetest() throws IOException
	{
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
	driver=new ChromeDriver(options);
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	File f=new File("../YTFramework/Object.properties"); //Connection Establish with File
	FileReader fr=new FileReader(f); //To read the file
	prop=new Properties();
	prop.load(fr);
	}
	
	@AfterMethod
	public void aftertest()
	{
	driver.close();
	}

}
