package Practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementInArray 
{
	public static List<Integer> duplicate_elements(int[] arr1,int[]arr2,int[]arr3)
	{
		List<Integer> list= new ArrayList<Integer>();
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j]&& arr2[j]== arr3[k])
			{
				list.add(arr1[i]);
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
		return list;
	}

	public static void main(String[] args)
	{
		int[] array1= {10,20,30,40,50,70};
		int[] array2= {40,50,60,70};
		int[] array3= {50,60,70};
		List<Integer> duplicate_array= duplicate_elements(array1,array2,array3);
		System.out.println(duplicate_array);


	}

}
