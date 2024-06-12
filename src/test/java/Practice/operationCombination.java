package Practice;

public class operationCombination 
{

	public static int findHighestValue(String operation,int[] array)
	{
		int highest_value= Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int result;
				if("addition".equals(operation))
				{
					result= array[i]+array[j];
				}
				else if ("Subtraction".equals(operation))
				{
					result=array[i]-array[j];
				}
				else if ("Multiplication".equals(operation)) 
				{
					result= array[i]*array[j];
				}
				else 
				{
					throw new IllegalArgumentException("invalid Operation");
				}
				if(result>highest_value)
				{
					highest_value=result;
				}
			}
			
		}
		return highest_value;
		
	}
	public static int findLowestValue(String operation,int[] array) 
	{
		int lowest_value=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int result;
				if("addition".equals(operation))
				{
					result=array[i]+array[j];
				}
				else if ("Subtraction".equals(operation)) 
				{
					result= array[i]-array[j];					
				}
				else if ("Multiplication".equals(operation)) 
				{
					result=array[i]*array[j];
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
		int[] arr= {10,20,30,40,50};
		int highest_add=findHighestValue("addition", arr);
		int lowest_add=findLowestValue("addition", arr);
		int highest_sub=findHighestValue("Subtraction", arr);
		int lowest_sub=findLowestValue("Subtraction", arr);
		int highest_mul=findHighestValue("Multiplication", arr);
		int lowest_mul=findLowestValue("Multiplication", arr);
		
		System.out.println("Highest Addition is :"+highest_add);
		System.out.println("Lowest Addition is :"+lowest_add);
		System.out.println("Highest subtraction is :"+highest_sub);
		System.out.println("Lowest subtraction is :"+lowest_sub);
		System.out.println("Highest multipliaction is :"+highest_mul);
		System.out.println("Lowest multipliaction is :"+lowest_mul);

	}

}
