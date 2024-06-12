package InterviewPrograms;

public class Max_Min_In_Array_4 {

	public static void main(String[] args) 
	{
		int[] array= {10,20,5,2,3,7,8,9,21,1,25};
		int[] numbers=max_min_number(array);
		for(int num: numbers)
		{
			System.out.println(num);
		}

	}

	private static int[] max_min_number(int[] array) 
	{
		int max= Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		for(int num:array)
		{
			if(num>max)
			{
				max=num;
			}
			if(num<min)
			{
				min=num;
			}
		}
		int [] final_numbers= {max,min};
		return final_numbers;
	}

}
