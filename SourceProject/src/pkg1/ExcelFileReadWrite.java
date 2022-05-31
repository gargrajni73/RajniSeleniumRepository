package pkg1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileReadWrite {

	public void ReadAndWrite() throws BiffException, IOException, WriteException
	{
		File f1=new File("../SourceProject/ExcelFileHandle1.xls");
		Workbook wb=Workbook.getWorkbook(f1);  //A method can return object of the class--getWorkbook is a static method
		Sheet sh=wb.getSheet(0);
		int rows=sh.getRows();
		int col=sh.getColumns();
		
		File f2=new File("../SourceProject/ExcelFileHandle.xls");
		WritableWorkbook wb2=Workbook.createWorkbook(f2);  //A method can return object of the class--getWorkbook is a static method
		WritableSheet sh2=wb2.createSheet("Rajni",0);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell c=sh.getCell(j,i);  //First column then column in Excel sheet
				Label l=new Label(j,i,c.getContents());		//Cell Structure
				sh2.addCell(l);
			}
		}
		
		wb2.write();		//For Saving the file
		wb2.close();		//For Closing the file
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		
		ExcelFileReadWrite obj=new ExcelFileReadWrite();
		obj.ReadAndWrite();
	}
}
