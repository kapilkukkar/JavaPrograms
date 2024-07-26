package Array_Programs;

import java.util.Arrays;

public class arrayExists 
{
	public static boolean exists(int[] ints, int k) 
	{
        int left = 0;
        int right = ints.length - 1;
       // System.out.println(right);

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            System.out.println("mid is :"+mid);

            if (ints[mid] == k) 
            {
                return true;  // Found k
            } 
            else if (ints[mid] < k) 
            {
                left = mid + 1;  // Search in the right half
            } 
            else 
            {
                right = mid - 1;  // Search in the left half
            }
        }

        return false;  // k not found
    }
	public static boolean exsist_binary(int[] ints, int k)
	{
		int index= Arrays.binarySearch(ints, k);
		return index>=0;
	}

    public static void main(String[] args) 
    {
        int[] ints = {-9, 14, 37, 102};

//        System.out.println(exsist_binary(ints, 102));  // true
//        System.out.println(exsist_binary(ints, 9));   
          System.out.println(exists(ints, 105));  // false
    }
}
