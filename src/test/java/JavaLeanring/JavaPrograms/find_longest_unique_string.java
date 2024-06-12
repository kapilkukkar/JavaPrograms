package JavaLeanring.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class find_longest_unique_string
{
	public static String unique_String(String input)
	{
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		int maxlength=0;
		int start=0;
		int largestNumber=0;
		for(int i=0; i<input.length();i++)
		{
			Character ch= input.charAt(i);
			if(map.containsKey(ch))
			{
				start=Math.max(start, map.get(ch)+1);
				System.out.println("start:"+start);
			}
			map.put(ch, i);
			System.out.println(map);
			if(i-start+1>maxlength)
			{
				maxlength=i-start+1;
				System.out.println("max:"+maxlength);
				largestNumber=start;
				System.out.println("largest"+largestNumber);
			}
		}
		return input.substring(largestNumber, largestNumber+maxlength);
		
	}

	public static void main(String[] args) 
	{
		String string="bcdecfc";
		String largest_String= unique_String(string);
		System.out.println(largest_String);

	}

}
