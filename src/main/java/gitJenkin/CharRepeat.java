package gitJenkin;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharRepeat {

	public static void main(String[] args) {
		String value="ChithraDevi";
		String lowerCase = value.toLowerCase();
		String replaceAll = lowerCase.replaceAll(" ", "");
		char[] ca = replaceAll.toCharArray();
		//System.out.println(ca.length);
		int count;
		HashMap<Character,Integer> map =new HashMap<Character,Integer>();
		//System.out.println(ca);
		/*for(int i=0;i<ca.length;i++)
		{
			System.out.println(ca[i]+"Position" +i);
		}*/
		/*LinkedHashMap<Integer,Character> maplist =new LinkedHashMap<Integer,Character>();
		for(int i=0;i<ca.length;i++)
		{
			maplist.put(i,ca[i]);
		}*/
		//System.out.println(maplist.get(1));
				//System.out.println(maplist);
		for(int i=0;i<ca.length;i++)
		{
			count=1;
		for(int j=i+1;j<ca.length;j++)
		{
			if(ca[i]==ca[j])
			{
				count++;
				ca[j]='0';
			}
		}
		if(count>1&&ca[i]!='0')
		{
		//System.out.println(ca[i]);
		//System.out.println(count);
			map.put(ca[i], count);
		}
		else if(count==1&&ca[i]!='0')
		{
			map.put(ca[i], count);
		}
		
		}
		System.out.println(map);
	}

}
