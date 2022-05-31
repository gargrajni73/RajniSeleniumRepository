package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Click on Tab Key
		Actions action=new Actions(driver);
		for(int i=1;i<=4;i++)
		{
		action.sendKeys(Keys.TAB).perform();
		}
	}

}
