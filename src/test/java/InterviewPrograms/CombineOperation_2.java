package InterviewPrograms;

public class CombineOperation_2 
{
	public static int highest_value(String operation,int[] arr)
	{

		int highest_number= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int result;
			for(int j=i+1;j<arr.length;j++)
			{
				if(operation.equals("addition"))
				{
					result=arr[i]+arr[j];
				}
				else if (operation.equals("subtraction"))
				{
					result=arr[i]-arr[j];
				}
				else if (operation.equals("multiplicarion"))
				{
					result=arr[i]*arr[j];
				}
				else
				{
					throw new IllegalArgumentException("invalid operation");
				}

				if(result>highest_number)
				{
					highest_number=result;
				}
			}
		}
		return highest_number;

	}
	public static int lowest_value(String operation,int[] arr)
	{

		int lowest_value= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int result;
			for(int j=i+1;j<arr.length;j++)
			{
				if(operation.equals("addition"))
				{
					result=arr[i]+arr[j];
				}
				else if (operation.equals("subtraction"))
				{
					result=arr[i]-arr[j];
				}
				else if (operation.equals("multiplicarion"))
				{
					result=arr[i]*arr[j];
				}
				else
				{
					throw new IllegalArgumentException("invalid operation");
				}

				if(result<lowest_value)
				{
					lowest_value=result;
				}
			}
		}
		return lowest_value;

	}

	public static void main(String[] args) 
	{
		int [] array= {1,2,3,4,5};
		int highest_addition=highest_value("addition", array);
		int highest_subtraction=highest_value("subtraction", array);
		int highest_multiplication=highest_value("multiplicarion", array);
		int lowest_addtion=lowest_value("addition", array);
		int lowest_subtraction=lowest_value("subtraction", array);
		int lowest_multipliaction=lowest_value("multiplicarion", array);
		System.out.println(highest_addition);
		System.out.println(lowest_addtion);
		System.out.println(highest_subtraction);
		System.out.println(lowest_subtraction);
		System.out.println(highest_multiplication);
		System.out.println(lowest_multipliaction);




	}

}
