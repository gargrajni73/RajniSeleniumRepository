package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {
	
	 ChromeDriver driver;
	 Properties prop;
	
	public VideoPlay(ChromeDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	public void videoplay() throws InterruptedException
	{
		//Click on Image
		Thread.sleep(2000);
		WebElement img=driver.findElement(By.linkText(prop.getProperty("img")));
		Thread.sleep(2000);
		img.click();
		Thread.sleep(2000);
	}
	
	public void videoplay1() throws InterruptedException
	{
		//Click on Image	
		Thread.sleep(2000);
		WebElement img1=driver.findElement(By.xpath(prop.getProperty("img1")));
		img1.click();
		Thread.sleep(2000);
	}
	public void videolike() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement like=driver.findElement(By.xpath(prop.getProperty("like")));
		like.click();
	}
	
	public void videochannelsubscription() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		WebElement channelsubscription=driver.findElement(By.xpath(prop.getProperty("channelsubscription")));
		channelsubscription.click();
	}
	
	public void videoComment() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(1000);
		
		WebElement commentclick=driver.findElement(By.id(prop.getProperty("commentclick")));
		commentclick.click();
		
		Thread.sleep(2000);
		WebElement comment=driver.findElement(By.xpath(prop.getProperty("comment")));
		comment.sendKeys("Good");
		
		Thread.sleep(1000);
		WebElement commentsubmit=driver.findElement(By.xpath(prop.getProperty("commentsubmit")));
		commentsubmit.click();
		
	}
	
}
