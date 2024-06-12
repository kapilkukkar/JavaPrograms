package JavaLeanring.JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_paris_array 
{
	public static List<int[]> findpairs(int[] array,int total_sum)
	{
		List<int[]> array1= new ArrayList<int[]>();
		Set<Integer> set= new HashSet<Integer>();

		for(int num : array)
		{
			int sub = total_sum-num;
			if(set.contains(sub))
			{
				int[] pair = {sub,num};
				array1.add(pair);
				//System.out.println("in array:"+"["+sub+","+num+"]");
			}
			else 
			{
				set.add(num);
				System.out.println("in set"+set);
			}
		}
		return array1;

	}
	public static List<int[]> findTriplets(int[] array, int total_sum) 
	{
		List<int[]> tripletsList = new ArrayList<int[]>();

		for (int i = 0; i < array.length - 2; i++) 
		{			
			int remainingSum = total_sum - array[i];
			Set<Integer> set = new HashSet<Integer>();

			for (int j = i + 1; j < array.length; j++)
			{
				int num = array[j];
				int sub = remainingSum - num;
				if (set.contains(sub))
				{
					int[] triplet = {array[i], sub, num};
					tripletsList.add(triplet);
				} 
				else 
				{
					set.add(num);
				}
			}
		}
		return tripletsList;
	}


	public static void main(String[] args) 	
	{
		int[] array_1= {1,2,3,4,5,6};
		int sum=6;
		List<int[]> new_list = findpairs(array_1,sum);
		for(int[] num: new_list)
		{
			System.out.println(Arrays.toString(num));
		}
		List<int[]> new_list1= findTriplets(array_1, sum);
		for(int[] num1:new_list1)
		{
			//System.out.println("Triplets are:"+Arrays.toString(num1));
		}

	}

}
