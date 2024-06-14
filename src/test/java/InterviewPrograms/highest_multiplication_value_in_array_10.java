package InterviewPrograms;

public class highest_multiplication_value_in_array_10
{
	public static int highest_multiplication(int[] array)
	{
		int highest_number= Integer.MIN_VALUE;
		int result=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				result= array[i]*array[j];
			}
			if(result>highest_number)
			{
				highest_number= result;
			}
		}
		return highest_number;
		
	}

	public static void main(String[] args) 
	{
		int[]arr= {10,18,3,98,15};
		int highest_number= highest_multiplication(arr);
		System.out.println(highest_number);

	}

}
