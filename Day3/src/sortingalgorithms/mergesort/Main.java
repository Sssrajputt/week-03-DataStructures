package sortingalgorithms.mergesort;



import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of book prices:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the book prices:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array
        MergeSort.sort(arr, 0, n - 1);

        // Displaying the sorted prices
        System.out.println("Sorted book prices:");
        for (int price : arr) {
            System.out.print(price + " ");
        }
    }
}
