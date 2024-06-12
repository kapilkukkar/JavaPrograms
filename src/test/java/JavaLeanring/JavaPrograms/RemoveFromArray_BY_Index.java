package JavaLeanring.JavaPrograms;
import java.util.*;

public class RemoveFromArray_BY_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display the array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Ask user for input
        System.out.print("Enter the index of the element to remove: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < numbers.length) {
            // Remove the element at the specified index
            numbers = removeElement(numbers, index);

            // Display the updated array
            System.out.println("Array after removal: " + Arrays.toString(numbers));
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }

        scanner.close();
    }

    // Method to remove an element from an array at a specified index
    public static int[] removeElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return arr; // Return the original array if the index is invalid
        }
        
        // Create a new array with size one less than the original array
        int[] newArr = new int[arr.length - 1];
        
        // Copy elements from the original array to the new array, excluding the element at the specified index
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        
        return newArr; // Return the new array with the element removed
    }
}
