package String;

public class covertArrayToString 
{
	public static void name(char []ch) 
	{
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			str=str+ch[i];
		}
		System.out.println(str);
	}

	public static void main(String[] args) 
	{
		char []ch= {'d','i','n','e','s','h','k','u','m','a','r'};
		name(ch);
	}

}
