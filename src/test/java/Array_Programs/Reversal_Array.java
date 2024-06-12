package Array_Programs;

public class Reversal_Array 
{
	public static boolean check_palindrom(String[] input)
	{
		int totalLength = 0;
		for (String str : input) {
			totalLength += str.length();
		}

		// Use two pointers to compare characters from both ends
		int leftIndex = 0;
		int rightIndex = totalLength - 1;

		for (String str : input) {
			for (char ch : str.toCharArray()) 
			{
				// Find the character at the right index in the array of strings
				int tempRightIndex = rightIndex;
				for (int i = input.length - 1; i >= 0; i--) 
				{
					if (tempRightIndex < input[i].length()) 
					{
						if (ch != input[i].charAt(tempRightIndex))
						{
							return false;
						}
						break;
					} else 
					{
						tempRightIndex -= input[i].length();
					}
				}
				leftIndex++;
				rightIndex--;
			}
		}

		return true;

	}

	public static void main(String[] args) 
	{
		String[] arr= {"madam","mam","DAD"};
		boolean result=check_palindrom(arr);
		System.out.println(result);

	}

}
