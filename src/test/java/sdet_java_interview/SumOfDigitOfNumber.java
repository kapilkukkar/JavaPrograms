package sdet_java_interview;

public class SumOfDigitOfNumber 
{
	public static int sum_of_number(int number)
	{
		int final_number=0;
		String numbers= String.valueOf(number);
		for(char ch:numbers.toCharArray())
		{
			//final_number+= Character.getNumericValue(ch);
			final_number+= Integer.parseInt(String.valueOf(ch));//Alternate Way to Convert Char to int
		}
		
		
		return final_number;
		
	}
	public static void main(String[] args)
	{
		
		int num= 78956;
		System.out.println(sum_of_number(num));
	}

}
