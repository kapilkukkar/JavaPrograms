package JavaLeanring.JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOfCharacters {

	public static void main(String[] args) 
	{

		String str = "Kapil KuKKar";
		String str1= str.toLowerCase();
		String[] arr = str1.split("");		
		Map<String, Integer> map= new HashMap<String,Integer>();
		int count = 1;

		for(int i=0;i<arr.length;i++)
		{
			if(!arr[i].isBlank())
			{

				if(map.containsKey(arr[i]))
				{
					
					map.put(arr[i], map.get(arr[i])+1);
				}
				else
				{
					map.put(arr[i], count);
				}

			}

		}
		System.out.println(map);
		System.out.println("-----------------");
		for(String word:map.keySet())
		{
			System.out.println("Number of Characters " + word + "=" + map.get(word));
		}
		System.out.println("--------------------------");
		for(Map.Entry<String, Integer>entryset:map.entrySet())
		{
			System.out.println(entryset.getKey()+ ":"+ entryset.getValue());
		}

	}

}
