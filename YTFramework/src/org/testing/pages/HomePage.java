package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	 ChromeDriver driver;
	 Properties prop;
	
	public HomePage(ChromeDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	public void clickTrending() throws InterruptedException
	{
		//Click on Explore
		WebElement explore=driver.findElement(By.xpath(prop.getProperty("explore")));
		explore.click();
		
		Thread.sleep(2000);
		//Click on Trending
		WebElement trending=driver.findElement(By.xpath(prop.getProperty("trending")));
		trending.click();
		
		Thread.sleep(1000);
		
	}
	
	public void clickHistory() throws InterruptedException
	{		
		Thread.sleep(2000);
		WebElement history=driver.findElement(By.xpath(prop.getProperty("history")));
		history.click();
	}
	
	public void clickSubscriptions() throws InterruptedException
	{		
		Thread.sleep(2000);
		WebElement subscriptions=driver.findElement(By.xpath(prop.getProperty("subscriptions")));
		subscriptions.click();
	}	
	
	public void clickWatchLater() throws InterruptedException
	{	
		Thread.sleep(2000);
		WebElement watchlater=driver.findElement(By.xpath(prop.getProperty("watchlater")));
		watchlater.click();
	}	
		
	public void clickLibrary() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement library=driver.findElement(By.xpath(prop.getProperty("library")));
		library.click();
	}

}
