package addPlace;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrive {
	
	public ArrayList getData(String testCaseName) throws IOException 
	{
		
		ArrayList testDataValue = new ArrayList();
		FileInputStream fis = new FileInputStream("C:\\Users\\Aditi\\Desktop\\Notes\\Selenium\\TestAPI.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		
		
		
		for(int i=0; i<sheets; i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("API"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
				Row firstrow = rows.next();
				
				Iterator <Cell> cellValue =  firstrow.cellIterator();
				
				int k=0;
				int column=0;
				
				while(cellValue.hasNext())
				{
					Cell value = cellValue.next();
					
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						column=k;
					}
					
					k++;
				}
				
				
				while(rows.hasNext())
				{
					Row rowValue = rows.next();
					
					if(rowValue.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName))
					{
						Iterator<Cell> testData = rowValue.cellIterator();
						
						while(testData.hasNext())
						{
							Cell c = testData.next();
							
							//if(c.getCellType()==CellType.STRING)
							
								testDataValue.add(c);
								
							
							
						/*	else
							{
								testDataValue.add(c.getNumericCellValue());
							}
							*/
						}
					}
				}
			}
			
		}
		
		
return testDataValue;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		

	}

}
