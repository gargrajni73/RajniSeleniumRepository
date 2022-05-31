package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileWriteData {

	public void WriteData(int row,int column) throws BiffException, IOException, WriteException
	{
		File f=new File("../SourceProject/ExcelFileHandle1.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);  //A method can return object of the class--getWorkbook is a static method
		WritableSheet sh=wb.createSheet("Rajni",0);
		System.out.println("Enter the data");
		Scanner scan=new Scanner(System.in);
		String data=null;
		for(int i=0;i<row;i++)		//loop for rows
		{
			for(int j=0;j<column;j++)		//loop for columns
			{
				data=scan.next();
				Label l=new Label(j,i,data);		//Cell Structure
				sh.addCell(l);
			}
		}
		
		wb.write();		//For Saving the file
		wb.close();		//For Closing the file
	}
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		ExcelFileWriteData obj=new ExcelFileWriteData();
		obj.WriteData(4,3);
	}

}
