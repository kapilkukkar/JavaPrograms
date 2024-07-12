package sorting;

import java.util.Arrays;

public class SortingAplhabetically 
{
	public static String sorting(String input)
	{
		String[] words= input.split(" ");	
		StringBuilder builder= new StringBuilder();
		for(String word:words)
		{
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			builder.append(new String(ch)).append(" ");
		}
		
		return builder.toString();
		
		
	}

	public static void main(String[] args)
	{
		String string="hello how are yours";
		System.out.println(sorting(string));
		

	}

}
