package Array_Programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FristRepeatingElement 
{
	public static void findfirstoccurancewithSET(int[]arr)
	{
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
			{
				System.out.println("First Occurance is :"+ arr[i]);
				return;
			}
			
		}
		System.out.println("No Repeating Element in Array");
	}
	public static void findfirstoccurancewithMAP(int[] arr)
	{
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			if(map.containsKey(num))
			{
				System.out.println("First Occurannce is:" + num);
				return;
			}
			else
			{
				map.put(num,i);
			}
		}
		System.out.println("No Repeating Element in Array");
	}

	public static void main(String[] args) 
	{
		int [] array= {12,1,2,9,6,5,8,12,1,9,1};
		findfirstoccurancewithMAP(array);
		findfirstoccurancewithSET(array);

	}

}
