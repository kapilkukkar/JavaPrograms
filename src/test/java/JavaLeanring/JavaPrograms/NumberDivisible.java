package JavaLeanring.JavaPrograms;

import java.util.Arrays;

public class NumberDivisible {

	public static void main(String[] args) 
	{
		
		String s1="kapil";
		String s2="ailpk";
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		char[] ch1 = s2.toCharArray();
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("anagram");
		}
		else
		{
		System.out.println("No");	
		}
		
		
		
	}

}
