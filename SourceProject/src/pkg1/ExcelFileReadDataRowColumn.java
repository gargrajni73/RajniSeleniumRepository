package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileReadDataRowColumn {
	
	public void ReadDataBasedUponRowNoAndColumnNo(int rowno,int colno) throws BiffException, IOException
	{
		File f=new File("../SourceProject/ExcelFileHandle.xls");
		Workbook wb=Workbook.getWorkbook(f);  //A method can return object of the class--getWorkbook is a static method
		Sheet sh=wb.getSheet(0);
		Cell c=sh.getCell(colno,rowno);  //First column then row in Excel sheet
		System.out.println(c.getContents());
	
	}

	public static void main(String[] args) throws BiffException, IOException
	{
				
		ExcelFileReadDataRowColumn obj=new ExcelFileReadDataRowColumn();
		obj.ReadDataBasedUponRowNoAndColumnNo(1,1);
	}

}
