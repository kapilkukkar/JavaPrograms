package JavaLeanring.JavaPrograms;

import org.testng.annotations.Test;

public class reversenumber 
{
	@Test	
	public void reverse_number_approach()
	{
		int number=1234;
		String numberString= String.valueOf(number);
		char[] character= numberString.toCharArray();
		String reversed="";
		for(int i= numberString.length()-1;i>=0;i--)
		{
			reversed=reversed+character[i];
		}
		System.out.println(Integer.parseInt(reversed));
	}
	
	@Test
	public void another_approach()
	{
		int number=1234;
		int reversed=0;
		while(number!=0)
		{
			reversed= reversed*10+number%10;
			number=number/10;
		}
		System.out.println(reversed);
		
	}

}
