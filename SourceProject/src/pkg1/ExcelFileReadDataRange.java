package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileReadDataRange {

	public void ReadDataBasedUponRange(int initialRow,int endRow) throws BiffException, IOException
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

	public static void main(String[] args) throws BiffException, IOException
	{
				
		ExcelFileReadDataRange obj=new ExcelFileReadDataRange();
		obj.ReadDataBasedUponRange(0,1);
	}
}

