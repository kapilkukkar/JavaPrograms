package Array_Programs;

import java.util.Arrays;

public class Remove_Duplicate_Without_set {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 30, 30, 40, 50, 50,25,25};

        // Sort the array
        Arrays.sort(numbers);

        // Remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Display the unique elements array
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return arr;

        // First pass to count the unique elements
        int uniqueCount = 1; // The first element is always unique
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array for unique elements
        int[] uniqueArr = new int[uniqueCount];
        uniqueArr[0] = arr[0];
        int index = 1;

        // Second pass to copy unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueArr[index] = arr[i];
                index++;
            }
        }

        return uniqueArr;
    }
}

