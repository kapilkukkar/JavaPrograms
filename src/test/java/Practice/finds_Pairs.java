package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class finds_Pairs 
{
	public static List<int[]> pairs(int[] array,int sum)
	{
		List<int[]> list= new ArrayList<int[]>();
		Set<Integer> set= new HashSet<Integer>();
		int sub=0;
		for(int num: array)
		{
			sub= sum-num;
			if(set.contains(sub))
			{
				int[] pair= {sub,num};
				list.add(pair);
			}
			else 
			{
			set.add(num);	
			}
		}
		return list;
		
	}

	public static void main(String[] args)
	{
		int[] input= {1,2,3,4,5};
		int total_sum=7;
		List<int[]> final_list= pairs(input,total_sum);
		for(int[] num:final_list)
		{
			System.out.println(Arrays.toString(num));
		}
	}

}
