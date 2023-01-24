package String;

import java.util.Arrays;

public class AnagramOrNot 
{
	public static String isSort(String str)
	{
		str=str.toLowerCase();
		str.replace(" ", "");
		char []ch =str.toCharArray();
		Arrays.sort(ch);
		str = String.valueOf(ch);	//convert tocharArray to String
		return str;
	}
	public static void isAnagram(String str1,String str2) 
	{
		if(isSort(str1).equals(isSort(str2)))
		{
			System.out.println(str1+" "+"and"+" "+str2+" is anagram");
		}
		else
		{
			System.out.println(str1+" "+"and"+" "+str2+" is  not anagram");
		}
		
	}
	public static void main(String[] args) 
	{
		String str1="THey See";
		String str2="THE EYES";
		isAnagram(str1, str2);
//		String str="THNGTR";
//		System.out.println(isSort(str));

	}

}
