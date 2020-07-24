package gitJenkin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RepeatedLetters {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/Jenkin.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(2);
		int rowcount = sheet.getLastRowNum();
		String[] letter =new String[rowcount];
		System.out.println(rowcount);
		for(int i=0;i<rowcount;i++)
		{
			letter[i] = sheet.getRow(i+1).getCell(0).getStringCellValue();
			//System.out.println(letter[i]);
		}
		int count = 0;
		for(int i =0;i<letter.length;i++)
		{
			count=1;
			for(int j=i+1;j<letter.length;j++)
			{
								if ((letter[i]).equals(letter[j]))
				{
					count++;
					letter[j]="0";
				}
			}
			if(count>1&&letter[i]!="0")
			{
				System.out.println(letter[i]);
			}
		}
	}

}
