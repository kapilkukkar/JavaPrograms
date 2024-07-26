package sdet_java_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import InterviewPrograms.chracter_occurance_5;



public class FindDuplicateCharcterInString 
{
	public static List<Character> find_Duplicate(String input)//1st approach
	{
		char[] ch= input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
				
			}
			else
			{
				map.put(c,1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				list.add(entry.getKey());
			}
		}
		return list;
		

	}
	public static Character[] find_Duplicates(String input)//2nd approach
	{
		char[] ch= input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		for(Character c:ch)
		{
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				list.add(entry.getKey());
			}
		}
		return list.toArray(new Character[0]);
		

	}

	public static void main(String[] args)
	{
		String string="nkflshosornkls";
		List<Character> elements= find_Duplicate(string);
		System.out.println(elements);
		Character[] elementCharacters=find_Duplicates(string);
		System.out.println(Arrays.toString(elementCharacters));

	}

}
