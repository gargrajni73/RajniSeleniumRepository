package org.testing.testscripts;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.assertions.Assertion1;
import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Signin;
import org.testing.pages.Signout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base{
	
	//Click on Trending
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		
		Signin s=new Signin(driver,prop);	
		s.signin("testingdummyselenium@gmail.com", "Ojas@2020");
		
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println("Date is"+d);
//		Integer hours=d.getHours(); 	
//		Integer mins=d.getMinutes();
//		Integer secs=d.getSeconds();
		
		//takeScreenshot is static method so no need to create object of the class
		
		Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot//TC1_1.png");

		HomePage home=new HomePage(driver,prop);
		home.clickTrending();
		
		//To Capture Logs
		//LogsCapture.takeLogs("TC1", "login successfully for TC1");
		Assertion1.assert1(driver.getCurrentUrl(),"https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl","TC1" ,"Login Successfully for TC1");
		
		Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot//TC1_2.png");
		
		VideoPlay video=new VideoPlay(driver,prop);
		video.videoplay();
		
		 Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot//TC1_3.png");
	//	Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot"+hours.toString()+":"+mins.toString()+":"+secs.toString()+"TC1.png");

		 Signout s1=new Signout(driver,prop);	
		 s1.signout();
	}
}
