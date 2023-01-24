package String;

//import java.util.Arrays;

public class ReverseStringWithoutChanging 
{
	public static void reverseScent(String str1,String str2) 
	{
		String [] word =str1.split(" ");
		//System.out.println(Arrays.toString(word));
		for(String ch:word)
		{
			StringBuilder s1=new StringBuilder(ch);
			str2=str2+" "+s1.reverse();
		}
		System.out.println(str2);
		
	}
	public static void main(String[] args)
	{
		String str1="mom love dad";
		String str2=" ";
		reverseScent(str1, str2);		
	}
}
