
 package String;

public class frequencyString 
{
	public static void charFreq(String str) 
	{
		
		for (int i = 0; i < str.length()-1; i++) 
		{
			int count=1;
			while(i<str.charAt(i)-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				i++;
			}
		
		System.out.println(str.charAt(i)+" "+count);
		}
		
	}
	public static void main(String[] args) 
	{
		String str="abbcccdddd";
		charFreq(str);

	}

}
