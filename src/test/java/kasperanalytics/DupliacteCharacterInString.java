package kasperanalytics;

import java.util.HashMap;
import java.util.Map;

public class DupliacteCharacterInString
{
	public static void deuplicatechar(String input)
	{
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(char ch : input.toCharArray())
		{
			if(ch!= ' ')
			{
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
		}
	}

	public static void main(String[] args)
	{
	 String str= "apple is fruit";
	 deuplicatechar(str);

	}

}
