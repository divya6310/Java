package gitJenkin;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

public class CountWordsHashMap extends Util{
@Test
	public void countWordsHashMap() throws IOException {
	//public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Object[] manip = readData(1);
		for (int i=0;i<=manip.length-1;i++)
		{
			String[] sen=manip[i].toString().split(" ");
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			for(int j=0;j<=sen.length-1;j++)
			{
				map.put(j, sen[j]);
			}
			System.out.println(map.size());
			sheet.getRow(i+1).createCell(3).setCellValue(map.size());
		}
		fis.close();
		writeData();
		
		

	}

}
