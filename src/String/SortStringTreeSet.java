package String;
import java.util.*;
public class SortStringTreeSet 
{
	public static void isSort(String str) 
	{
		char [] ch=str.toCharArray();
		TreeSet<Character> ts=new TreeSet<>();
		for(char cha:ch)
		{
			ts.add(cha);
		}
		//System.out.println(String.valueOf(ts));
		String s1=String.valueOf(ts);
		System.out.println(s1);
	}
	public static void main(String[] args) 
	{
		String str="poiuytrewqasdfghjkmnbvcxz";
		isSort(str);
	}
}
