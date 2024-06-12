package Array_Programs;

public class Find_second_smallest_number_Array 
{
	public static int second_smallest_element(int[] arr)
	{
		int samllest= Integer.MAX_VALUE;
		int second_smallest= Integer.MAX_VALUE;
		for(int num: arr)
		{
			if(num<samllest)
			{
				second_smallest=samllest;
				samllest=num;
			}
			else if (num<second_smallest && num != samllest) 
			{
				second_smallest= num;
			}
		}
		return second_smallest;
	}

	public static void main(String[] args) 
	{
		int[] array= {-1,10,25,36,45,5};
		int element = second_smallest_element(array);
		System.out.println(element);

	}

}
