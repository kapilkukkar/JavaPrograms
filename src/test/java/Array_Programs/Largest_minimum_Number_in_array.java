package Array_Programs;

public class Largest_minimum_Number_in_array 
{

	public static int largest_number(int[]arr1)
	{
		int max_number= Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max_number)
			{
				max_number=arr1[i];
			}
		}
		return max_number;
		
	}
	public static int smallest_number(int[]arr2)
	{
		int min_number= Integer.MAX_VALUE;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]<min_number)
			{
				min_number=arr2[i];
			}
		}
		return min_number;
		
	}
	public static int[] genric_function_for_both_operations(int[] arr)
	{
		int max_number= Integer.MIN_VALUE;
		int min_number=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max_number)
			{
				max_number=arr[i];
			}
			if (arr[i]<min_number)
			{
				min_number=arr[i];
			}
		}
		int[] result= {max_number,min_number};
		return result;
		
	}
	public static void main(String[] args) 
	{
		int[] array= {10,20,30,40,50};
		int largest_number=largest_number(array);
		int smallest_number=smallest_number(array);
		int[] combine= genric_function_for_both_operations(array);
		System.out.println("Largest Number is :"+largest_number);
		System.out.println("Samllest Number is :"+smallest_number);
		System.out.println("Largest is:"+combine[0]+ "\n"+"Smallest is:"+ combine[1]);

	}

}
