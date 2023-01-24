package String;

public class RevesreString 
{
	public static void isReverse(String str1,String str2) 
	{
		for (int i=str1.length()-1;i>=0;i--) 
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
	}
	public static void isReverseWhil(String str1,String str2) 
	{
		int i=str1.length();
		while(i>0)
		{
			str2=str2+str1.charAt(i-1);
			System.out.println(str2);
			i--;
		}
		System.out.println(str2);
	}
	public static void main(String[] args) 
	{
		String str1="dineshkumarj";
		String str2="";
		//isReverse(str1, str2);
		isReverseWhil(str1, str2);
		
		
	}
}
