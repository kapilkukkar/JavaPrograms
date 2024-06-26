package stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class SplitAlphaNumeric 
{
	public static List<String> split(String str)
	{
		List<String>list= new ArrayList<String>();
		StringBuffer chracter= new StringBuffer();
		StringBuffer number= new StringBuffer();
		StringBuffer special = new StringBuffer();
		for(char ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				number.append(ch);
			}
			else if (Character.isAlphabetic(ch))
			{
				chracter.append(ch);
			}
			else
			{
				special.append(ch);
			}
		}
		list.add(number.toString());
		list.add(chracter.toString());
		list.add(special.toString());
		
		return list;
	}

	
	public static void main(String[] args) 
	{
		String input="Welcome234To567Java89Programming0@#!!";
		List<String> seprateList= split(input);
		System.out.println(seprateList);

	}

}
