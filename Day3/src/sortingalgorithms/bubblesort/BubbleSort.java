package sortingalgorithms.bubblesort;

import java.util.*;

class BubbleSort {

    // Corrected bubbleSort method
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - 1 - i; j++) { // Optimize with (n - 1 - i)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}