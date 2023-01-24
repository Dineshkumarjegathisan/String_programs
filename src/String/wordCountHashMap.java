package String;
import java.util.*;
import java.util.Map.Entry;
public class wordCountHashMap 
{
	public static void isCount(String str) 
	{
		 String [] word =str.split(" ");
		 HashMap<String,Integer> hs=new HashMap<>();
		 for(String words:word)
		 {
			 if(hs.containsKey(words))
			 {
				 hs.put(words, hs.get(words)+1);
			 }
			 else
			 {
				 hs.put(words, 1);
			 }
		 }
		 //System.out.println(hs);
		 Set<Map.Entry<String, Integer>> m = hs.entrySet();
		 for(Map.Entry<String,Integer> entry:m)
		 {
			 if(entry.getValue()>=0)
			 {
				 System.out.println(entry.getKey()+"  "+entry.getValue());
			 }

		 }
		
	}

	public static void main(String[] args) 
	{
		String str="life bro is cruseal bro";
		isCount(str);

	}

}
