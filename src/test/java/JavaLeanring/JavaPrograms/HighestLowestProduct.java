package JavaLeanring.JavaPrograms;

public class HighestLowestProduct {

	public static void main(String[] args) {
		int[] array = {5,10,4,3,8}; // Sample array

		int highestProduct = findHighestProduct(array);
		int lowestProduct = findLowestProduct(array);

		System.out.println("Highest product: " + highestProduct);
		//System.out.println("Lowest product: " + lowestProduct);
	}
	public static int findHighestProduct(int[] array) 
	{
		int highestProduct = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i + 1; j < array.length; j++) 
			{
				int product = array[i] * array[j];
				//System.out.println("p="+product);
				if (product > highestProduct) 
				{
					highestProduct = product;
					//System.out.println("h"+highestProduct);
				}
				//System.out.println("--");
			}

		}
		return highestProduct;
	}

	public static int findLowestProduct(int[] array) {
		int lowestProduct = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
			{
				int product = array[i] * array[j];
				if (product < lowestProduct) 
				{
					lowestProduct = product;
				}
			}
		}
		return lowestProduct;
	}
}
