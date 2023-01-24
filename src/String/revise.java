package String;
//import java.lang.*;
public class revise 
{
	public static void isreturn(String str1,String str2) 
	{
		int i= str1.length();
		while(i>0)
		{
				str2=str2+str1.charAt(i-1);
				i--;
		}
		System.out.println(str2);
	}
	
	
			public static void main(String[] args) 
			{
				String str1="guna";
				String str2="";
				isreturn(str1,str2);
			}
}
