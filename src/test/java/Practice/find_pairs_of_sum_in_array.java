package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_pairs_of_sum_in_array 
{
	public static List<int[]> find_pairs(int total,int[]arr)
	{
		List<int[]> array= new ArrayList<int[]>();
		Set<Integer> set= new HashSet<Integer>();
		for(int num: arr)
		{
			int sub= total-num;
			if(set.contains(sub))
			{
				int[] pair= {sub,num};
				array.add(pair);
			}
			set.add(num);
		}
		return array;
		
	}
	public static void main(String[] args) 
	{
		int[] array_list= {1,2,5,4,8,9,6};
		int total_sum=12;
		List<int[]> final_list= find_pairs(total_sum, array_list);
		for(int[] list:final_list)
		{
			System.out.println(Arrays.toString(list));
		}
	}

}
