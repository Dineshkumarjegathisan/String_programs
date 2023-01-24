package NewString;

public class TimingString 
{
	public static void timeExecution(String str,String key) 
	{
		int crrentIndex, prevsionIndex=0;
		int time = 0;
		for (int i = 0; i < key.length(); i++) 
		{
			crrentIndex =str.indexOf(key.charAt(i));
			//System.out.println(str.indexOf(key.charAt(i)));
			time=time+Math.abs(crrentIndex-prevsionIndex);
			//System.out.println(time+Math.abs(crrentIndex-prevsionIndex));
			//System.out.println(time);
			prevsionIndex=crrentIndex;		
		}	
		System.out.println(time);
	}
	public static void main(String[] args) 
	{
		String str="0123456789";
		String key="472";
		timeExecution(str,key);
	}
}
