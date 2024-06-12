package JavaLeanring.JavaPrograms;

public class CountingWords 
{
	public static int count_words(String input)
	{
		int count=0;
		char[] characters= input.toCharArray();
		for(int i = 0; i< input.length();i++)
		{
			if(characters[i] ==  's')
			{
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) 
	{
		System.out.println(count_words("This is a string "));

	}

}
