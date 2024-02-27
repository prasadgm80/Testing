package AutomationLearning.MavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public ArrayList getData(String testcasename) throws IOException
	{
		
		ArrayList a = new ArrayList();
		FileInputStream fis = new FileInputStream("C:\\Documents\\Exams\\Selenium\\TestData1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0; i<sheets; i++)
		{
		
			if(workbook.getSheetName(i).equalsIgnoreCase("Data"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				//identify test case by scanning first row
				Iterator<Row>rows =sheet.iterator();
				Row firstRow= rows.next();
				Iterator<Cell> ce=firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						 column = k;
					}
					k++;
				}
				System.out.println(column);
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
					{
						Iterator <Cell> cv= r.cellIterator();
						while(cv.hasNext())
						{
							
							Cell c = cv.next();
							if(c.getCellType()==CellType.STRING)
							{
								
							a.add( c.getStringCellValue());
							}
							else
							{
								a.add(c.getNumericCellValue());
								//a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}								
					}
				}
			}
		}
			
return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
				
	}

}
