package Array_Programs;

import java.util.HashMap;
import java.util.Map;

public class CountPairs 
{
	public static int count_number_of_pairs(int[] array)
	{
		Map<Integer, Integer> total_pair= new HashMap<Integer, Integer>();
		for(int num:array)
		{
			total_pair.put(num, total_pair.getOrDefault(num,0)+1);
		}
		System.out.println(total_pair.values());
		int pair_count=0;
		for(int count:total_pair.values())
		{
			pair_count+=count/2;
			System.out.println("pair count:" +pair_count);
		}
		
		return pair_count;
		
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,1,2,2,8,8,9,1,2,8,9,8,1,2};
		int pairs= count_number_of_pairs(arr);
		System.out.println(pairs);
		
		
	}

}
