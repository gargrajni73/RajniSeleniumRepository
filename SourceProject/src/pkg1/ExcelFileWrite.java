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

public class ExcelFileWrite {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException 
	{
		File f=new File("../SourceProject/ExcelFileHandle1.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);  //A method can return object of the class--createWorkbook is a static method
		WritableSheet sh=wb.createSheet("Rajni",0);
		for(int i=0;i<3;i++)		//loop for rows
		{
			for(int j=0;j<3;j++)		//loop for columns
			{
				Label l=new Label(j,i,"Ojas");		//Cell Structure
				sh.addCell(l);
			}
		}
		
		wb.write();		//For Saving the file
		wb.close();		//For Closing the file
	}

}
