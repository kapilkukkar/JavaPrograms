package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class chracter_occurance_5 {

	public static void main(String[] args) 
	{
		String str="fhdlfriiosnvkslfh";
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else 
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);

	}

}
