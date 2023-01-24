package String;

public class Palindrome 
{
	public static void isPlai(String str1,String str2) 
	{
		for (int i=str1.length()-1;i>=0;i--) 
		{
				//str2=str2+str1.charAt(i);
				str2+=str1.charAt(i);
				System.out.println(str2);
		}
		if(str1.equals(str2))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}
		
	}
	public static void main(String[] args) 
	{		
		String str1="mom";
		String str2=" ";
		isPlai(str1, str2);
	}
}
