package String;

public class FrequencyOfChar 
{
	public static void isFrequnecy(String str) 
	{
		char []ch =str.toCharArray();
		boolean visited[]=new boolean[ch.length];
		
		for (int i = 0; i < ch.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(visited[i]==false && ch[i]==ch[j])
				{
					visited[j]=true;
					count++;
				}
			}
			if(visited[i]==false)
			{
				System.out.println(ch[i]+">>"+count);
			}
			
		}
		
	}
	public static void main(String[] args) 
	{
		String str="aavvbbasjkhcsj";
		isFrequnecy(str);
	}
}

