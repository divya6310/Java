package gitJenkin;

import java.io.IOException;

public class StringReverse extends Util {
	
	
	public static void main(String args[]) throws IOException
	{
		Object [] words= readData(1);
		for (int i=0;i<=words.length-1;i++)
		{
			//System.out.println(words.length);
			String[] sen = words[i].toString().split(" ");
			String res = "";
			for (int j=sen.length-1;j>=0;j--)
			{
				//System.out.println(sen.length);
			res =res+sen[j]+" ";	
			}
			//System.out.println(res);
			sheet.getRow(i+1).createCell(1).setCellValue("Pass");
			sheet.getRow(i+1).createCell(2).setCellValue(res);
			
		}
		fis.close();
		writeData();
	}

}
