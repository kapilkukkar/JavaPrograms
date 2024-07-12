package sorting;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;

public class SortingAplhabeticallyWithoutInbuiltFunction 
{
	public static String sorting(String input)
	{
		String[] words= input.split(" ");	
		StringBuilder builder= new StringBuilder();
		for(String word:words)
		{
			
			String newString= sortcharmanually(word);
			builder.append(newString).append(" ");
		}
		
		return builder.toString();
		
		
	}
	public static String sortcharmanually(String input)
	{
		char[] ch= input.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-i-1;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		return new String(ch);
		
	}

	public static void main(String[] args)
	{
		String string="hello how are yours";
		System.out.println(sorting(string));
		

	}

}
