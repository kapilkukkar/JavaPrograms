package Array_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementInSorted 
{

	public static List<Integer> collectedArray(int[]arr1,int[] arr2,int[] arr3)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		List<Integer> results= new ArrayList<Integer>();
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]== arr3[k])
			{
				results.add(arr1[i]);
				i++;
				j++;
				k++;
			}
			else if (arr1[i]<arr2[j]) 
			{
				i++;
			}
			else if (arr2[j]<arr3[k])
			{
				j++;
			}
			else
			{
				k++;
			}
		}
		return results;

	}
	public static void main(String[] args) 
	{
		int[]array_1= {12,15,19,23,29,45,78,56};
		int[]array_2= {9,12,13,16,26,29,78,56};
		int[]array_3= {10,12,14,18,78,29,40,56,62,85,19};
		List<Integer> duplicateElement= collectedArray(array_1,array_2,array_3);
		System.out.println(duplicateElement);


	}

}
