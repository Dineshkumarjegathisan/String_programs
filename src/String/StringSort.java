package String;

import java.util.Arrays;

public class StringSort 
{
	public static void sortString(String str) 
	{
	    char []ch	=str.toCharArray();
	    char temp=0;
	    for (int i = 0; i <str.length()-1; i++) 
	    {
	    	for(int j=0;j<str.length()-1;j++)
	    	{
	    		if(ch[j]>ch[j+1])
	    		{
	    			temp=ch[j];
	    			ch[j]=ch[j+1];
	    			ch[j+1]=temp;
	    		}
	    	}
		}
	    System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		String str="fedcba";
		sortString(str);	
	}
}
