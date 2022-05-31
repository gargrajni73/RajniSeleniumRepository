package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.Assertion1;
import org.testing.base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Signout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5  extends Base{
	
	//Click on Video Play and then channel subscription

	@Test
	public void test() throws InterruptedException, IOException
	{
		Signin s=new Signin(driver,prop);	
		s.signin("testingdummyselenium@gmail.com", "Ojas@2020");		
		
		VideoPlay video=new VideoPlay(driver,prop);
		video.videoplay1();
		video.videochannelsubscription();
		
		Assertion1.assert1(driver.getCurrentUrl(),"https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl","TC5","Login Successfully for TC5" );
		
		Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot//TC5.png");

		Signout s1=new Signout(driver,prop);	
		 s1.signout();
	}

}
