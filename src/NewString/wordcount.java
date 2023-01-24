package NewString;

public class wordcount 
{
	public static void isWordCount(String str)
	{
		String [] word =str.split(" ");
		boolean visited[]=new boolean[word.length];
		for(int i=0;i<word.length;i++)
		{
			int count=1;
			for (int j = i+1; j < word.length; j++) 
			{
				if(visited[i]==false && word[i].equals(word[j]))
				{
					visited[j]=true;
					//count++;
					System.out.println("The repeat words are"+"  : "+ word[j]);
				}
			}
//			if(visited[i]==false)
//			{
//				System.out.println(word[i]+">>>>>>"+count);
//			}
		}
		
	}
	public static void main(String[] args) 
	{
		String str ="dinesh kumar jegathisan velmani dinesh kumar";
		isWordCount(str);

	}

}
