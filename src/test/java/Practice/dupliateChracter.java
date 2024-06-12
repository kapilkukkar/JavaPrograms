package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Array_Programs.DuplicateElementInSorted;

public class dupliateChracter 
{

	public static Set<Character> Duplicate_element(String input)
	{
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		Set<Character> storing_duplicate= new HashSet<Character>();
		char[] chracter= input.toLowerCase().toCharArray();
		for(char ch:chracter)
		{
			if(map.containsKey(ch))
			{
				
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			//System.out.println(entry.getKey()+" :"+ entry.getValue());
			if(entry.getValue()>1)
			{
				storing_duplicate.add(entry.getKey());
			}
		}
		
		return storing_duplicate;
	}
	
	public static void main(String[] args) 
	{
		Set<Character> duplicate= Duplicate_element("hjgtjhfd");
		System.out.println(duplicate);

	}

}
