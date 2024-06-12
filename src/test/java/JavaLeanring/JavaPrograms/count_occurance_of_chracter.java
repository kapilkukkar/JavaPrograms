package JavaLeanring.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class count_occurance_of_chracter 
{
	public static Map<Character, Integer> count_occurance(String input)
	{
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(char ch:input.toLowerCase().toCharArray())
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
		return map;
		
	}

	public static void main(String[] args) 
	{
		String str="hashas";
		Map<Character, Integer> outputMap= count_occurance(str);
		System.out.println(outputMap);
		

	}

}
