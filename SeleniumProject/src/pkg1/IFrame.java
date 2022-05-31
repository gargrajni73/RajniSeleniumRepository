package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
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
		
	}

}
