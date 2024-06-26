package Practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicate
{
	public static String unique_string(String input)
	{
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		int max_length=0;
		int start=0;
		int longest=0;
		for(int i=0;i<input.length();i++)
		{
			Character character= input.charAt(i);
			if(map.containsKey(character))
			{
				start= Math.max(start, map.get(character)+1);
			}
			map.put(character, i);
			if(i-start+1>max_length)
			{
				max_length=i-start+1;
				longest=start;
			}
		}
		
		return input.substring(longest, longest+max_length);
		
	}
	
	public static void main(String[] args)
	{
		String str="bcdfefe";
		String final_string=unique_string(str);		
		System.out.println(final_string);
		

	}

}
