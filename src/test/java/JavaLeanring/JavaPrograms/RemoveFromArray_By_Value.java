package JavaLeanring.JavaPrograms;

import java.util.*;

public class RemoveFromArray_By_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the integer array
        int[] numbers = {10, 20, 30, 40, 50,10,40,10};

        // Display the array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Ask user for input
        System.out.print("Enter the value to remove: ");
        int valueToRemove = scanner.nextInt();

        // Remove the specified value from the array
        numbers = removeElement(numbers, valueToRemove);

        // Display the updated array
        System.out.println("Array after removal: " + Arrays.toString(numbers));

        scanner.close();
    }

    // Method to remove an element with a specified value from an array
    public static int[] removeElement(int[] arr, int value) {
        // Count the occurrences of the value in the array
        int count = 0;
        for (int num : arr)
        {
            if (num == value)
            {
            	
                count++;
                System.out.println(count);
            }
        }

        // Create a new array with size equal to the original array minus the count of occurrences of the value
       int[] newArr = new int[arr.length - count];

        // Copy elements from the original array to the new array, excluding the elements with the specified value
        int index = 0;
        for (int num : arr)
        {
            if (num != value)
            {
            	newArr[index] = num;
                index++;
            }
        }
  
        return newArr; // Return the new array with the specified value removed
    }
}
