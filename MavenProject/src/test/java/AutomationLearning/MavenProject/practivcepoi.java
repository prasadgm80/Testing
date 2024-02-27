package AutomationLearning.MavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.rowset.internal.Row;

public class practivcepoi {

	
	public void getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Documents\\Exams\\Selenium\\TestData1.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		int sheets = book.getNumberOfSheets();
		
		for (int i=0; i<sheets; i++)
		{
			if(book.getSheetName(i).equalsIgnoreCase("Data"))
			{
				XSSFSheet sheet = book.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
				Row first = rows.next();
				Iterator<Cell> ce = first.cellIterator();
				
				int k;
				int column = 0;
				
				while(ce.hasNext())
				{
					Cell value = ce.next();
					
					if(value.getStringCellValue().equalsIgnoreCase("Test Cases"))
					{
						column = k;
					}
					
					k++;
				}
						
				while(rows.hasNext())
				{
					Iterator cell = ce.next();
					
					if(value.getStringCellValue().equalsIgnoreCase("Test Cases Name"))
				}
			}
		}
		
		
		}
}
