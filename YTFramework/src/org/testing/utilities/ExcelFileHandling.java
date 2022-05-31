package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileHandling {

	public static void ReadDataOfParticularCell(int rowno,int colno) throws BiffException, IOException
	{
		File f=new File("../SourceProject/ExcelFileHandle.xls");
		Workbook wb=Workbook.getWorkbook(f);  //A method can return object of the class--getWorkbook is a static method
		Sheet sh=wb.getSheet(0);
		Cell c=sh.getCell(colno,rowno);  //First column then row in Excel sheet
		System.out.println(c.getContents());
	}
	
	public static void ReadDataOfParticularRow(int rowno) throws BiffException, IOException
	{
		File f=new File("../SourceProject/ExcelFileHandle.xls");
		Workbook wb=Workbook.getWorkbook(f);  //A method can return object of the class--getWorkbook is a static method
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		int col=sh.getColumns();
		for(int i=0;i<rows;i++)
		{
			if(i==rowno)
			{
			for(int j=0;j<col;j++)
			{
				Cell c=sh.getCell(j,i);  //First column then column in Excel sheet
				System.out.println(c.getContents());
			}
			}
		}
	}	
		
		public static void ReadDataOfParticularRange(int initialRow,int endRow) throws BiffException, IOException
		{
			File f=new File("../SourceProject/ExcelFileHandle.xls");
			Workbook wb=Workbook.getWorkbook(f);  //A method can return object of the class--getWorkbook is a static method
			Sheet sh=wb.getSheet(0);
			int rows=sh.getRows();
			int col=sh.getColumns();
			for(int i=0;i<rows;i++)
			{
				if((i>=initialRow)&&(i<=endRow))
				{
				for(int j=0;j<col;j++)
				{
					Cell c=sh.getCell(j,i);  //First column then column in Excel sheet
					System.out.println(c.getContents());
				}
				}
			}
		}

	}
	
