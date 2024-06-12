package JavaLeanring.JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_of_Words {

	public static void main(String[] args)
	{
		String str = "i am learning python and java and python again and again";
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		int count=1;
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
				
			}
			else
			{
				
				map.put(arr[i], count);
			}
		}
		System.out.println(map);
		
		System.out.println("--------------------");
		for(String x : map.keySet())
		{
			System.out.println("Count of Word "+ x + " = "+map.get(x));
		}
		System.out.println("---------------------");
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"="+ entry.getValue());
		}
	//converting map to arrayList	
		System.out.println("---------------------");
		List<String> word_list= new ArrayList<String>(map.keySet());
		System.out.println(word_list);
		
		
		System.out.println("---------------------");
		List<Integer>numeric_list= new ArrayList<Integer>(map.values());
		System.out.println(numeric_list);
		
	}

}
