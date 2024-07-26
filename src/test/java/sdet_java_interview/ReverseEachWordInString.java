package sdet_java_interview;

public class ReverseEachWordInString 
{
	public static String reverse_Each_Word(String input)//1st approach
	{
		StringBuilder builder= new StringBuilder();
		String[] word_array= input.split(" ");
		
		for(String word:word_array)
		{
			String reversed_string="";
			
			for(int i= word.length()-1;i>=0;i--)
			{
				reversed_string +=word.charAt(i);
			}
			builder.append(reversed_string).append(" ");
			
		}
		return builder.toString().trim();
		
	}
	public static String reverse_each_Word(String input)//2nd approach
	{
		StringBuilder builder= new StringBuilder();
		String[] word_array= input.split(" ");
		
		for(String word:word_array)
		{			
			for(int i= word.length()-1;i>=0;i--)
			{
				builder.append(word.charAt(i));
			}
			builder.append(" ");
			
		}
		return builder.toString().trim();
		
	}

	public static void main(String[] args) 
	{
		String string="hello how you doing";
		System.out.println(reverse_Each_Word(string));
		System.out.println(reverse_each_Word(string));

	}

}
