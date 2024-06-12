package JavaLeanring.JavaPrograms;

public class OperationCombinations {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Sample array

        int highestAddition = findHighestResult(array, "addition");
        int lowestAddition = findLowestResult(array, "addition");
        int highestSubtraction = findHighestResult(array, "subtraction");
        int lowestSubtraction = findLowestResult(array, "subtraction");
        int highestMultiplication = findHighestResult(array, "multiplication");
        int lowestMultiplication = findLowestResult(array, "multiplication");

        System.out.println("Highest addition result: " + highestAddition);
        System.out.println("Lowest addition result: " + lowestAddition);
        System.out.println("Highest subtraction result: " + highestSubtraction);
        System.out.println("Lowest subtraction result: " + lowestSubtraction);
        System.out.println("Highest multiplication result: " + highestMultiplication);
        System.out.println("Lowest multiplication result: " + lowestMultiplication);
    }

    // Method to find the highest result by performing specified operation
    public static int findHighestResult(int[] array, String operation) {
        int highestResult = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                int result;
                if ("addition".equals(operation)) 
                {
                    result = array[i] + array[j];
                } else if ("subtraction".equals(operation)) 
                {
                    result = array[i] - array[j];
                } else if ("multiplication".equals(operation)) 
                {
                    result = array[i] * array[j];
                } else 
                {
                    throw new IllegalArgumentException("Invalid operation");
                }
                if (result > highestResult)
                {
                    highestResult = result;
                }
            }
        }
        return highestResult;
    }

    // Method to find the lowest result by performing specified operation
    public static int findLowestResult(int[] array, String operation) {
        int lowestResult = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                int result;
                if ("addition".equals(operation)) 
                {
                    result = array[i] + array[j];
                } else if ("subtraction".equals(operation)) 
                {
                    result = array[i] - array[j];
                } else if ("multiplication".equals(operation)) 
                {
                    result = array[i] * array[j];
                } else {
                    throw new IllegalArgumentException("Invalid operation");
                }
                if (result < lowestResult) 
                {
                    lowestResult = result;
                }
            }
        }
        return lowestResult;
    }
}
