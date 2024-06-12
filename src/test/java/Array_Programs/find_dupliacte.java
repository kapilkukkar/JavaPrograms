package Array_Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_dupliacte {

	public static void main(String[] args) {
		int[] arr = {1, 5, 4, 2, 1, 7, 4,5};
		
		//1st approach
		List<Integer> array_listIntegers=new ArrayList<Integer>();
		for(int i: arr)
		{
			array_listIntegers.add(i);
		}
		Set<Integer> new_setIntegers= new HashSet<Integer>(array_listIntegers);
		System.out.println(new_setIntegers);
		
		//2. Approach
//		Set<Integer> set = new HashSet<Integer>();
//		Set<Integer> duplicates = new HashSet<Integer>(); // Set to store duplicate elements
//
//		for (int num : arr)
//		{
//			if (!set.add(num)) 
//			{ 
//		
//				duplicates.add(num);				
//
//			}
//		}
//
//
//		Integer[] duplicatesArray = duplicates.toArray(new Integer[0]);
//
//		System.out.println(Arrays.toString(duplicatesArray));
//
//	}
		

}}
