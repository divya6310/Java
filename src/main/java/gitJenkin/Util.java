package gitJenkin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class Util {
	static FileInputStream fis;
	static XSSFWorkbook book ;
	static XSSFSheet sheet;
	static FileOutputStream fos;
	
	public static Object[] readData(int sheetNo) throws IOException
	{
		 fis = new FileInputStream("./Data/Jenkin.xlsx");
		 book = new XSSFWorkbook(fis);
		 sheet =book.getSheetAt(sheetNo);
		int row=sheet.getLastRowNum();
		Object[] n = new Object[row];
		for(int i=0;i<row;i++)
		{
			 n[i]= sheet.getRow(i+1).getCell(0).getStringCellValue();
			 System.out.println(n[i]);
			
		}
		
		return n;
		}
	
	
	public static void writeData() throws IOException
	{
		 fos=new FileOutputStream("./Data/Jenkin.xlsx");
		 book.write(fos);
		// book.close();
		 fos.close();
		 
	}
	


}
