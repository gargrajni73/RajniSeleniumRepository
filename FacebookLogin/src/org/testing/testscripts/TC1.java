package org.testing.testscripts;


	import java.io.File;
	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class TC1 {

		ChromeDriver driver; 
		
		@Test(dataProvider="dp1")
		public void testcase1(String username,String password) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","../FacebookLogin/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys(username);
			
			WebElement password1=driver.findElement(By.name("pass"));
			password1.sendKeys(password);
			
			Thread.sleep(1000);
			
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			
			Thread.sleep(2000);
			
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getCurrentUrl().equals("https://www.facebook.com/?sk=welcome"))
			{
				Thread.sleep(1000);

				WebElement profile=driver.findElement(By.xpath("//div[@aria-label='Your profile']"));
				profile.click();
				
				Thread.sleep(1000);
				
				WebElement logout=driver.findElement(By.xpath("//*[text()='Log Out']"));
				logout.click();
				Thread.sleep(2000);
				driver.close();
			}
			
			else
			{
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.close();
			}
					
		}
		
		@DataProvider
		public Object[][] dp1() throws BiffException, IOException
		{
			File f=new File("../FacebookLogin/DataDrivenExcelFile.xls");
			Workbook wb=Workbook.getWorkbook(f);
			Sheet sh=wb.getSheet(0);
			int rows=sh.getRows();
			int columns=sh.getColumns();
			
			Object[][] obj=new Object[rows][columns];
			
			for(int i=1;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{
					Cell c=sh.getCell(j,i);
					obj[i][j]=c.getContents();
				}
			}
			
			return obj;
			
			}

	}

