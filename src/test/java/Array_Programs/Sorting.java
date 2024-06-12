package Array_Programs;

import java.util.Arrays;

import javax.imageio.ImageTranscoder;

public class Sorting {

	public static void main(String[] args) 
	{
		
		int[] array= {10,25,85,96,15,78,63,78,15,98,12,369,8};
//		int max= Arrays.stream(array).max().getAsInt();
//		int max=array[0];
//		for(int i=1;i<array.length;i++)
//		{
//			if(array[i]>max)
//			{
//				max=array[i];
//			}
//		}
//		Arrays.sort(array);
//		int max= array[array.length-1];
//		int min=array[0];
//		System.out.println(max);
//		int min = Arrays.stream(array).min().getAsInt();
//		System.out.println(min);
//		int min = array[0];
//		for(int i=1;i<array.length;i++)
//		{
//			if(!(array[i]>min))
//			{
//				min=array[i];
//			}
//		}
//		System.out.println(min);
		
		int minumum = Arrays.stream(array).min().getAsInt();
		int maximum= Arrays.stream(array).max().getAsInt();
		System.out.println(minumum);
		System.out.println(maximum);
	}
		
		

}
