package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CtrlClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		//Click on Video
				WebElement video=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-rich-grid-media'][1]"));
				
				Actions action=new Actions(driver);
				action.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
				
				Thread.sleep(2000);
				
				driver.close();
	}

}
