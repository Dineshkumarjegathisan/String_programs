package NewString;

public class FrqencyOfChar 
{
	public static void isFrq(String str) 
	{
	    char[]	ch =str.toCharArray();
		boolean []visited =new boolean[str.length()];
		
		for (int i = 0; i < ch.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(visited[i]==false && ch[i]==ch[j])
				{
					count++;
					visited[j]=true;
					
				}	
			}
			if(visited[i]==false)
			{
			
				System.out.println(ch[i]+" "+"prsent in "+" "+count+"times");
			}
		}
		
	}
	public static void main(String[] args) 
	{
		String str="diineshs";
		isFrq(str);
	}
}
