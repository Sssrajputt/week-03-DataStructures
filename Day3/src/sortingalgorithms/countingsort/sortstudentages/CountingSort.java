package sortingalgorithms.countingsort.sortstudentages;

import java.util.Scanner;

public class CountingSort {
    // Function to perform counting sort
    public static void countingSort(int[] arr, int range) {
        int n = arr.length;

        // Create count array to store the frequency of each age
        int[] count = new int[range + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i <= range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in the correct positions in the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
