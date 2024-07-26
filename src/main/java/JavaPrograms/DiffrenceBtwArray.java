package JavaPrograms;

public class DiffrenceBtwArray 
{
	public static int largestdiff(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				System.out.println("max is="+max);
			}
			else if (min<arr[i])
			{
				min=arr[i];
				System.out.println("min is="+min);
			}
		}
		return max-min;
		
	}
	

	public static void main(String[] args) 
	{
		int[] array= {12,5,89,45,26,78,29,125};
		System.out.println(largestdiff(array));

	}

}
