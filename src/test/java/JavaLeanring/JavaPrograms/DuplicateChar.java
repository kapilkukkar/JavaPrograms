package JavaLeanring.JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateChar
{
	public static Set<Character> finddupliacte(String input)
	{
		Map<Character, Integer> charcount= new HashMap<Character, Integer>();
		Set<Character> duplicate= new HashSet<Character>();		
		for(char c:input.toLowerCase().toCharArray())
		{
			if(charcount.containsKey(c))
			{
				charcount.put(c, charcount.get(c)+1);
			}
			else
			{
				charcount.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer>entry:charcount.entrySet())
		{
			if(entry.getValue()>1)
			{
				duplicate.add(entry.getKey());

			}

		}


		return duplicate;

	}

	public static void main(String[] args)
	{

		Set<Character> duplicateCharacters = finddupliacte("hackerearth");
		if(duplicateCharacters.isEmpty())
		{
			System.out.println("No Duplicate Character found");
		}
		else
		{
			System.out.println("Duplicate charcters are:"+duplicateCharacters);
		}

	}

}
