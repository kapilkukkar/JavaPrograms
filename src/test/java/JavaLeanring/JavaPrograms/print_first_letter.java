package JavaLeanring.JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class print_first_letter 
{
	public static List<Character> firstletter(String input)
	{
		String[] wordStrings= input.split(" ");
		List<Character>list= new ArrayList<Character>();
		for(String value:wordStrings)
		{
			list.add(value.charAt(0));
		}
		return list;
		
	}

	public static void main(String[] args)
	{
		String string= "Hello how are you doing";
		List<Character> finalstring=firstletter(string);
		System.out.println("input is:" + string+"\n"+"First Chracters are:"+ finalstring);
		

	}

}
