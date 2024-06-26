package kasperanalytics;

public class LargestElementInArray 
{
	public static int largestElement(int[] arr)
	{
		int max_number= Integer.MIN_VALUE;
		for(int i: arr)
		{
			if(i>max_number)
			{
				max_number=i;
			}
		}
		return max_number;
	}

	public static void main(String[] args) 
	{
		int[] array= {10,25,6,3,9,78,6,54,6,31,99,105};
		int largestNumber= largestElement(array);
		System.out.println(largestNumber);

	}

}
