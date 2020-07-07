package gitJenkin;

import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FibonacciSeries extends Util    {
	
//	@Test
//public void fiboevaluation() throws IOException
	public static void main(String args[])  throws IOException 
{
		int[] val=readData(0);
		
		//Util.fis.close();
		System.out.println(val.length);
	int j=0;
	int k=1;
	for(int  s=0;s<val.length;s++)
	{
		System.out.println(val[s]);
	for(int i=1;i<=val[s];i++)
	{
		if(i==1)
		{
			System.out.println(0);
			sheet.getRow(s+1).createCell(i+1).setCellValue("0");
		}
		else if(i==2)
		{
			System.out.println(1);
			sheet.getRow(s+1).createCell(i+1).setCellValue("1");
		}
		else
		{
			int temp=j+k;
			j=k;
			k=temp;
			System.out.println(temp);
			sheet.getRow(s+1).createCell(i+1).setCellValue(temp);
		}
		sheet.getRow(s+1).createCell(1).setCellValue("Pass");
		
		
	}
	}
	Util.fis.close();
	Util.writeData();
	
	
}

	
	

}
