package gitJenkin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class IterateWhile {

	//public static void main(String[] args) {
	@Test	
	public void iteratorWhile() {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Selenium");
		map.put(2, "TestNG");
		map.put(3, "Git");
		
		System.out.println(map);
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me =(Map.Entry) iterator.next();
			System.out.println(me.getKey()+" = "+ me.getValue());
			
		}
		
		for (Map.Entry me1: map.entrySet())
		{
			System.out.println(me1.getValue() +" = "+ me1.getKey());
		}

	}

}
