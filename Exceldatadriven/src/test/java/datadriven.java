import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		
		FileInputStream file= new FileInputStream("F:\\excel\\Exceldatadriven technique1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		int sheets= workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("test"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);
			}
		}
		
		
		
		
		
		 
		
	}
	
}
