package Practice;

import java.util.HashSet;
import java.util.Set;

public class String_After_remove_dupliacte 
{

	public static String after_removal(String input)
	{
		Set<Character> duplicate= new HashSet<Character>();
		for(char ch: input.toLowerCase().toCharArray())
		{
			duplicate.add(ch);
		}
		StringBuilder newString= new StringBuilder();
		for(char ch1:duplicate)
		{
			newString.append(ch1);
		}
		return newString.toString();
	}
	public static void main(String[] args) 
	{
		String inputString="asdfghhgfdsa";
		System.out.println(inputString.length());
		String final_value= after_removal(inputString);
		System.out.println(final_value);
		System.out.println(final_value.length());

	}

}
