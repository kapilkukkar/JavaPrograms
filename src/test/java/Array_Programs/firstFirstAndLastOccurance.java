package Array_Programs;

public class firstFirstAndLastOccurance 
{
	public static void firstlastoccurance(int[] arr,int value)
	{
		int first=-1;
		int last=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				if(first==-1)
				{
					first=i;
				}
				else
				{
					last=i;
				}				
			}
			
		}
		if(first!=-1)
		{
			System.out.println("First Occurance is=" + first);
			System.out.println("Last Occurance is="+ last);
		}
		else
		{
			System.out.println("Element not Present in array");
		}
		
	}

	public static void main(String[] args) 
	{
		int[] array= {1,2,3,4,1,2,5,9,6,3,4,8,5,2,7,4,8,9};
		int element=4;
		firstlastoccurance(array, element);
		

	}

}
