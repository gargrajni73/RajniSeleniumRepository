package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.Assertion1;
import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.Signin;
import org.testing.pages.Signout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4  extends Base{
	
	//Click on Video Play

	@Test
	public void test() throws InterruptedException, IOException
	{

		Signin s=new Signin(driver,prop);	
		s.signin("testingdummyselenium@gmail.com", "Ojas@2020");		
		
		VideoPlay video=new VideoPlay(driver,prop);
		video.videoplay1();
		video.videolike();
		
		Assertion1.assert1(driver.getCurrentUrl(),"https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl","TC4","Login Successfully for TC4" );
		
		Screenshot.takeScreenshot(driver, "D://Classes//Java Selenium//Screenshot//TC4.png");

		Signout s1=new Signout(driver,prop);	
		 s1.signout();
	}
}
