package sortingalgorithms.quicksort.sortproductprices;

import java.util.Scanner;

public class QuickSort {
    // Method to partition the array
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choosing the pivot as the last element
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and the pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to perform Quick Sort
    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort the left and right partitions
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}
