package JavaLeanring.JavaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovalDuplicate
{
	public static String removedupliacte(String input)
	{
		Set<Character> duplaicate= new LinkedHashSet<Character>();
		for(char ch:input.toLowerCase().toCharArray())
		{
			duplaicate.add(ch);

		}		
		StringBuilder newstring= new StringBuilder();
		for(Character character : duplaicate)
		{
			
			newstring.append(character);
		}
		return newstring.toString();
	}

	public static void main(String[] args)
	{
		String value= removedupliacte("hackerearthp");
		if(value.isEmpty())
		{
			System.out.println("String was empty");
		}
		else
		{
		System.out.println("String after removal of dupliacte :" + value);	
		}

	}

}
