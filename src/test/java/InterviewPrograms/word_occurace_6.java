package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class word_occurace_6 {

	public static void main(String[] args) 
	{
		String string="hello how are you how you doing";
		Map<String, Integer> map= new HashMap<String, Integer>();
		for(String str: string.split(" "))
		{
			if(map.containsKey(str))
			{
				map.put(str,map.get(str)+1);
			}
			else
			{
				map.put(str, 1);
			}
		}
		System.out.println(map);

	}

}
