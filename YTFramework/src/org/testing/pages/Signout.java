package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signout {
	
	 ChromeDriver driver;
	 Properties prop;
	
	public Signout(ChromeDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	public void signout() throws InterruptedException
	{
		//Click on Dummy
		Thread.sleep(2000);
		WebElement dummy=driver.findElement(By.id(prop.getProperty("dummy")));
		dummy.click();
		
		Thread.sleep(2000);
		
		//Click on Signout
		WebElement signout=driver.findElement(By.xpath(prop.getProperty("signout")));
		signout.click();
	}
}
