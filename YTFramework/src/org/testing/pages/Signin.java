package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin {
	
	 ChromeDriver driver;
	 Properties prop;
	
	public Signin(ChromeDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	public void signin(String username,String pass) throws InterruptedException
	{
		//Click on Sign in
		WebElement signin=driver.findElement(By.xpath(prop.getProperty("signin")));
		signin.click();
		
		//Enter Email
		WebElement email=driver.findElement(By.xpath(prop.getProperty("email")));
		email.sendKeys(username);
		
		Thread.sleep(2000);
		
		//Click on Next
		
		WebElement next=driver.findElement(By.xpath(prop.getProperty("next")));
		next.click();
		
		Thread.sleep(2000);
		
		//Enter Password		
		WebElement password=driver.findElement(By.xpath(prop.getProperty("password")));
		password.sendKeys(pass);
		
		Thread.sleep(1000);
		
		//Click on Next
		WebElement next1=driver.findElement(By.xpath(prop.getProperty("next")));
		next1.click();
				
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
	}
}
