package pkg1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting {
	
	@Test(dataProvider="dp2")
	public void testcase1(String username,String password)
	{
		System.out.println("Username is:"+username);
		System.out.println("Password is:"+password);
	}
	
	@DataProvider
	public Object[][] dp1()					//Return array of object //Object is the parent class of all classes in java
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="username1";
		obj[0][1]="password1";
		obj[1][0]="username2";
		obj[1][1]="password2";
		obj[2][0]="username3";
		obj[2][1]="password3";
		return obj;
	}
	
	@DataProvider
	public Object[][] dp2() throws BiffException, IOException
	{
		File f=new File("../SeleniumProject/DataDrivenExcelFile.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		int columns=sh.getColumns();
		
		Object[][] obj=new Object[rows][columns];
		
		for(int i=0;i<rows;i++)
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
