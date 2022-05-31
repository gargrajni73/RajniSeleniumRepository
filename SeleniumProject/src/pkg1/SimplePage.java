package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimplePage {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.cssSelector("input#email"));
		username.sendKeys("gargrajni73@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Rajni@456");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
	}

}
