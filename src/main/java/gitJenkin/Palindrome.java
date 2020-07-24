package gitJenkin;

public class Palindrome {
	
	public static void main(String[] args)
	{
		String value ="divya";
		/*
		StringBuilder str = new StringBuilder(value);
				StringBuilder reverse = str.reverse();
				//System.out.println(reverse);
				if(value.equals(reverse))
				{
					System.out.println("Given Sring string is palindrome");
				}
				else
				{
					System.out.println("Not Palindrome");
				}*/
		
		char[] text=value.toCharArray();
		String reverse = "";
		System.out.println(text.length);
		System.out.println(text);
		for(int i=text.length-1;i>=0;i--)
		{
			reverse =reverse+(text[i]);
			
		}
		System.out.println(reverse);
		if(reverse.equals(value))
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
