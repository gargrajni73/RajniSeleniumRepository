package pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupUsingXpath {
	
				ChromeDriver driver;
				@Before
				public void beforetest()
				{
				System.setProperty("webdriver.chrome.driver","../SeleniumProject/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				}
				
				@Ignore								//To Ignore testcase
				@Test
				public void Ignoretestcase()
				{
					System.out.println("Rajni");
				}
				
				@BeforeClass					//Method should be static here
				public static void beforeclass()
				{
					System.out.println("Good");
				}
				
				@AfterClass					//Method should be static here
				public static void afterclass()
				{
					System.out.println("Bad");
				}
				
				@Test
				public void test() throws InterruptedException
				{
				//Click on Create New Account Button
				WebElement createnewaccount=driver.findElement(By.linkText("Create New Account"));
				createnewaccount.click();
				
				Thread.sleep(2000);
				
				//Enter Firstname
				WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
				firstname.sendKeys("Ojas");
				
				//Enter Lastname
				WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
				lastname.sendKeys("Singla");
				
				//Enter Email id
				WebElement email=driver.findElement(By.xpath("//*[@name='reg_email__']"));
				email.sendKeys("Ojas.singla@yahoo.com");
				
				Thread.sleep(1000);
				
				//Renter Email id
				WebElement email1=driver.findElement(By.xpath("//*[@*='reg_email_confirmation__']"));
				email1.sendKeys("Ojas.singla@yahoo.com");
								
				//Enter Password
				WebElement password=driver.findElement(By.xpath("//input[@type='password' and @id='password_step_input']"));
				password.sendKeys("ojas2020");
				
				//Select Date
				WebElement Daydropdown=driver.findElement(By.xpath("//select[@name='birthday_day' or @title='Day']"));
				Select dropdown=new Select(Daydropdown);
				dropdown.selectByIndex(29);
				
				//Select Month
				WebElement Monthdropdown=driver.findElement(By.xpath("//select[contains(@name,'month')]"));
				Select dropdown1=new Select(Monthdropdown);
				dropdown1.selectByVisibleText("Nov");
				
				//Select Year
				WebElement Yeardropdown=driver.findElement(By.xpath("//select[contains(@name,'birthday')][3]"));
				Select dropdown2=new Select(Yeardropdown);
				dropdown2.selectByValue("2005");
				
				Thread.sleep(1000);
				
				//Select Gender
				WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
				gender.click();
				
				//Click on Sign Up button
				WebElement signup=driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
				signup.click();
				Thread.sleep(2000);
				}
				
				
				@After
				public void aftertest()
				{
					driver.close();
				}

	}
