package String;

import java.util.Arrays;

public class covertStringToArry
{
	public static void stringtoarray(String str) 
	{
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
		
	}

	public static void main(String[] args) 
	{
		String str="dineshkumar";//['d','i','n','e','s','h','k','u','m','a','r']
		stringtoarray(str);
	}

}
