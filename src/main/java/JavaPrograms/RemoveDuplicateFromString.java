package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateFromString 
{
	public static String removeduplicate(String input)
	{
		Set<String> set= new LinkedHashSet<String>();
		String [] input_arr= input.split(" ");
		for(String word:input_arr)
		{
			set.add(word);
		}
		
		return String.join(" ", set);
		
	}
	public static void removeduplicatevlaue(String input)
	{
		Map<String, Integer> map= new HashMap<String, Integer>();
		String [] input_arr= input.split(" ");
		for(String word:input_arr)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) 
	{
		String string="hello how how are are you";
		System.out.println(removeduplicate(string));
		//removeduplicatevlaue(string);
		

	}

}
