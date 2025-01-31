package sortingalgorithms.mergesort;


import java.util.Scanner;

public class MergeSort {
    // Method to merge two halves
    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // Copying data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merging the two halves
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements of leftArr[]
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copying remaining elements of rightArr[]
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Method to sort the array using Merge Sort
    public static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort the halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
}