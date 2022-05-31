package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		//Close popup
		driver.findElement(By.className("langCardClose")).click();
		
		Thread.sleep(1000);
		
		//Close login
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		//Click on From
		WebElement fromcity=driver.findElement(By.xpath("//input[@id='fromCity']"));
		fromcity.click();
		
		Thread.sleep(2000);
		
		//Enter value in FromCity		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("B");
		
		Thread.sleep(4000);
		
		//Select City
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		
		//Enter value in ToCity		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("K");
		
		Thread.sleep(4000);
		
		//Select City
		Actions action1=new Actions(driver);
		action1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		//Select Date
		driver.findElement(By.xpath("//div[@aria-label='Fri May 06 2022']")).click();;
		
		Thread.sleep(2000);
		
		//Click on Search
		WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
		search.click();
		
	}

}
