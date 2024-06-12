package Array_Programs;

import java.util.ArrayList;
import java.util.List;

public class SameElementInTwoArray 
{
	public static List<Integer> commanelement(int[]arr1,int[]arr2)
	{
		List<Integer> elements= new ArrayList<Integer>();
		int i = 0;
		int j = 0;

		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				elements.add(arr1[i]);
				i++;
				j++;
			}
			else if (arr1[i]<arr2[j]) 
			{
				i++;
			}
			else
			{
				j++;
			}
		}

		return elements;

	}

	public static void main(String[] args) 
	{
		int[] array_1= {5,9,12,16,19,25,29};
		int[] array_2= {10,12,19,22,24,25,29,32};
		List<Integer> elementList= commanelement(array_1,array_2);
		System.out.println(elementList);

	}

}
