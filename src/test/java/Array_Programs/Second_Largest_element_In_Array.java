package Array_Programs;

public class Second_Largest_element_In_Array 
{

	public static int find_second_largest(int[] arr)
	{
		int largest= Integer.MIN_VALUE;
		int second_largest= Integer.MIN_VALUE;		
		for(int i: arr)
		{
			if(i>largest)
			{
				second_largest=largest;				
				largest=i;
				
			}
			else if (i>second_largest && i!=largest) 
			{
				second_largest=i;
				
			}
		}
		return second_largest;
		
	}
	public static void main(String[] args) 
	{
		
		int[] array= {12,10,25};
		int second_element=find_second_largest(array);
		System.out.println(second_element);

	}

}
