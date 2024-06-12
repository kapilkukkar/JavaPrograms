package Array_Programs;

public class Third_largest_element_in_array 
{

	public static int third_largets_element(int[]arr)
	{
		if(arr.length<3)
		{
			System.out.println("There should be more than three element in array");
		}
		int largest_num=Integer.MIN_VALUE;
		int second_largest= Integer.MIN_VALUE;	
		int third_largest= Integer.MIN_VALUE;
		for(int num:arr)
		{
			if(num>largest_num)
			{
				third_largest=second_largest;
				second_largest=largest_num;
				largest_num=num;
				
			}
			else if (num>second_largest && num!= largest_num)
			{
				third_largest=second_largest;
				second_largest=num;
			}
			else if (num>third_largest && num!= second_largest && num!=largest_num) 
			{
				third_largest= num;
			}
		}
		return third_largest;
		
	}
	public static void main(String[] args)
	{
		int[] array= {25,98,85};
		int third_element= third_largets_element(array);
		System.out.println(third_element);

	}

}
