package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Click on Create New Account Button
		WebElement createnewaccount=driver.findElement(By.linkText("Create New Account"));
		createnewaccount.click();
		
		Thread.sleep(2000);
		
		//Enter Firstname
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Ojas");
		
		//Enter Lastname
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Singla");
		
		//Enter Email id
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("Ojas.singla@yahoo.com");
		
		Thread.sleep(1000);
		
		//Renter Email id
		WebElement email1=driver.findElement(By.name("reg_email_confirmation__"));
		email1.sendKeys("Ojas.singla@yahoo.com");
		
		Thread.sleep(1000);
		
		//Enter Password
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("ojas2020");
		
		//Select Date
		WebElement Daydropdown=driver.findElement(By.cssSelector("select[title='Day']"));
		Select dropdown=new Select(Daydropdown);
		dropdown.selectByIndex(29);
		
		//Select Month
		WebElement Monthdropdown=driver.findElement(By.cssSelector("select#month"));
		Select dropdown1=new Select(Monthdropdown);
		dropdown1.selectByVisibleText("Nov");
		
		//Select Year
		WebElement Yeardropdown=driver.findElement(By.cssSelector("select[title='Year']"));
		Select dropdown2=new Select(Yeardropdown);
		dropdown2.selectByValue("2005");
		
		Thread.sleep(1000);
		
		//Select Gender
		WebElement gender=driver.findElement(By.cssSelector("input[value='2']"));
		gender.click();
		
		//Click on Sign Up button
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		

	}

}
