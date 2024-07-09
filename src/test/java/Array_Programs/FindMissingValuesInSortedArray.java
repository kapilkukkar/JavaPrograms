package Array_Programs;
import java.util.ArrayList;
import java.util.List;

public class FindMissingValuesInSortedArray {

	public static List<Integer> findMissingValues(int[] array) 
	{
		List<Integer> missingValues = new ArrayList<Integer>();
		int n = array.length;
		if (array[0] != 1) // Handle case where missing numbers not start from 1
		{
			for (int i = 1; i < array[0]; i++) 
			{
				missingValues.add(i);
			}
		}		
		for (int i = 1; i < n; i++)// Search for gaps and add missing numbers 
		{
			if (array[i] != array[i - 1] + 1)
			{
				int start = array[i - 1] + 1;
				int end = array[i] - 1;
				for (int j = start; j <= end; j++) 
				{
					missingValues.add(j);
				}
			}
		}		
		if (array[n - 1] != n + 1) // Handle case where missing numbers end at n + 1
		{
			for (int i = array[n - 1] + 1; i <= n + 1; i++) 
			{
				missingValues.add(i);
			}
		}

		return missingValues;
	}
	public static int handlemultipleMissingvalue(int[] array)
	{
		int prev=array[0];
		for(int i=1;i<array.length;i++)
		{
			int gap= array[i]-prev;
			if(gap==2)
			{
				System.out.println("Missing Number is "+(prev+1));
			}
			else if (gap>2)
			{
				System.out.println("Missing Numbers are: " + (prev + 1) + " to " + (array[i] - 1));

			}
			prev=array[i];
		}


		return prev;

	}

	public static void main(String[] args) {
		int[] array = {1, 3, 4, 5,7,12};
		List<Integer> missingValues = findMissingValues(array);
		System.out.println("Missing values: " + missingValues); // Output: [4, 9, 10, 11, ..., 24]
		handlemultipleMissingvalue(array);
	}
}
