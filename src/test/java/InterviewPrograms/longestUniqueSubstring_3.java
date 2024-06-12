package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class longestUniqueSubstring_3 
{

	public static void main(String[] args) 
	{
		String string="bcdecfc";
		String newstr=unique_string(string);
		System.out.println(newstr);

	}

	private static String unique_string(String string) 
	{
		int max=0;
		int start=0;
		int largest=0;
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<string.length();i++)
		{
			char ch= string.charAt(i);
			if(map.containsKey(ch))
			{
				start=Math.max(start, map.get(ch)+1);
			}
			map.put(ch, i);
			if(i-start+1>max)
			{
				max= i-start+1;
				largest=start;
			}
		}
		return string.substring(largest, largest+max);
		
		
	}

}
