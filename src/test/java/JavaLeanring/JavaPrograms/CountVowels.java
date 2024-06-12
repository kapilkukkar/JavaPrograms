package JavaLeanring.JavaPrograms;


public class CountVowels 
{

	public static int count_vowels(String str)
	{
		int count =0;
		for(int i=0; i<str.length();i++)
		{
			Character ch= str.toLowerCase().charAt(i);
			if(ch=='a'|| ch == 'e' || ch=='i'|| ch == 'o'|| ch == 'u')
			{
				count++;
			}
		}
		
		return count;
		
	}
	public static void main(String[] args) 
	{
	
		String input= "Welcome";
		int number_vowels = count_vowels(input);
		System.out.println(number_vowels);
		


	}}
