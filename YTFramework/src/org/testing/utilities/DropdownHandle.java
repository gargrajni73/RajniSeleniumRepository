package org.testing.utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	
	static ChromeDriver driver;
	static Properties prop;

	public static void dropDownHandleByVisibleText(String text1)
	{
		WebElement dropDown=driver.findElement(By.xpath(prop.getProperty("dropDownHandleByVisibleText")));
		Select text=new Select(dropDown);
		text.selectByVisibleText(text1);
		
	}
	
	public static void dropDownHandleByValue(String val)
	{
		WebElement dropDown=driver.findElement(By.xpath(prop.getProperty("dropDownHandleByValue")));
		Select value=new Select(dropDown);
		value.selectByValue(val);
	}
	
	public static void dropDownHandleByIndex(int input)
	{
		WebElement dropDown=driver.findElement(By.xpath(prop.getProperty("dropDownHandleByIndex")));
		Select index=new Select(dropDown);
		index.selectByIndex(input);
	}

}
