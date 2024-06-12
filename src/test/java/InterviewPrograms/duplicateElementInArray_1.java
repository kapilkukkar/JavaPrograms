package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.sql.rowset.JoinRowSet;

public class duplicateElementInArray_1 
{
	public static void duplicate_element(int[] arr)
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int num:arr)
		{
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}
			else
			{
				map.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
				
			}
		}
	
		
		
	}
	public static void find_dupliacte_with_hashset(int[] arr)
	{
		Set<Integer> set= new HashSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		System.out.println(set);
	}

	public static void main(String[] args)
	{
		int[] array= {1,5,2,3,6,4,2,8,9,6,21,5,2,39,21,39};
		duplicate_element(array);
		System.out.println("-------------------");
		find_dupliacte_with_hashset(array);

	}

}
