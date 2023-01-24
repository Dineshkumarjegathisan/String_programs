package NewString;

public class GivenStringPalindrome 
{
	public static  boolean pali( String str1) 
	{
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		if( str1.equals(str2)) {
			return true ;
		}
		else {
			return false ;
		}
		
	}

	public static void main(String[] args) 
	{
		String str1="cbc";
		System.out.println( pali(str1));
	}

}
