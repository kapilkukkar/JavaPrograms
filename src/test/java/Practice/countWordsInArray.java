package Practice;

import java.util.HashMap;
import java.util.Map;

public class countWordsInArray {

	public static void main(String[] args) 
	{
		

		String str= "I love python and java but python and java are important languages java";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String word: str.split(" "))
		{
			if(map.containsKey(word))
			{
				map.put(word,map.get(word)+1 );
			}
			else 
			{
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
	}

}
