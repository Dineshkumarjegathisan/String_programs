package String;

public class FirstRepeated 
{
	public static void isFirst(String str) 
	{
		char []ch =str.toCharArray();
		System.out.println(ch);
		for(char c:ch)
		{
			if(str.indexOf(c)!=str.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		String str="engineering";
		isFirst(str);
	}
}
