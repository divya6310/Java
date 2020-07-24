package gitJenkin;

public class RepeatedStrings {

	public static void main(String[] args) {
		String value="Hi This is Divya Arun";
		String lowerCase = value.toLowerCase();
		String[] words = lowerCase.split(" ");
		
		//System.out.println(words.length);
		int count ;
		for (int i=0;i<words.length;i++)
		{
			count =1;
			
			for (int j=i+1;j<words.length;j++)
			{
				if ((words[i]).equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0")
			{
				System.out.println(words[i]);
				System.out.println(count);		
			}
			
		}
		

	}

}
