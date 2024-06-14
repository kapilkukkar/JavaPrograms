package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_pairs_7 
{
	public static List<int[]> find_pairs(int [] array,int sum)
	{
		Set<Integer> set = new HashSet<Integer>();
		
		List<int[]>arrayList= new ArrayList<int[]>();
		int sub;
		for(int num:array)
		{
			sub= sum-num;
			if(set.contains(sub))
			{
				int[]pair= {sub,num};
				arrayList.add(pair);
			} 
			else
			{
				set.add(num);
			}
			
		}
		return arrayList;
		
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,6,8,9};
		int total_sum= 12;
		List<int[]> list= find_pairs(arr, total_sum);
		for(int[] num:list)
		{
			System.out.println(Arrays.toString(num));
		}
		

	}

}
