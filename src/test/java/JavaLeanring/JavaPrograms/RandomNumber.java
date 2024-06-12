package JavaLeanring.JavaPrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) 
	{
	//int[] arr= {5,6,7,9,10,11,15,18,23,24,27,31,33,35,43,44,54,57,62,67};	
	
	Random random =  new Random();
	
	for(int i=1;i<=10;i++)
	{
		int random_number= random.nextInt(1,40);
		System.out.println(random_number);
	}
	

	}

}
