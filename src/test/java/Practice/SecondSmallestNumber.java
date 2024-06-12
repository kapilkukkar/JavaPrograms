package Practice;

public class SecondSmallestNumber 
{
	public static int second_smallest_number_in_Array(int[]array)
	{
		int smallest_number=Integer.MAX_VALUE;
		int second_smallest_number= Integer.MAX_VALUE;
		for(int num:array)
		{
			if(num<smallest_number)
			{
				second_smallest_number=smallest_number;
				smallest_number=num;
			}
			else if (num<second_smallest_number && num!= smallest_number) 
			{
				second_smallest_number=num;
			}
		}
		return second_smallest_number;

	}

	public static void main(String[] args) 
	{
		int[] numbers= {15,8,5,6,9,4,97,6,49,3,2,189,69,98};
		int second = second_smallest_number_in_Array(numbers);
		System.out.println(second);


	}

}
